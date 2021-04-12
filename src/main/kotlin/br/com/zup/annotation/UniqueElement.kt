package br.com.zup.annotation

import br.com.zup.exception.internal.AlreadyExistsException
import br.com.zup.utils.valOf
import io.micronaut.core.annotation.AnnotationValue
import io.micronaut.validation.validator.constraints.ConstraintValidator
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext
import javax.inject.Singleton
import javax.persistence.EntityManager
import javax.persistence.NoResultException
import javax.transaction.Transactional
import javax.validation.Constraint
import javax.validation.ReportAsSingleViolation
import kotlin.annotation.AnnotationTarget.*
import kotlin.annotation.AnnotationRetention.RUNTIME

@ReportAsSingleViolation
@Constraint(validatedBy = [UniqueElementValidation::class])
@Retention(RUNTIME)
@Target(FIELD, CONSTRUCTOR, PROPERTY, VALUE_PARAMETER)
annotation class UniqueElement(
    val domain: String,
    val fieldName: String,
    val message: String = "Message Default"
)

@Singleton
open class UniqueElementValidation(private val manager: EntityManager) : ConstraintValidator<UniqueElement, Any> {

    @Transactional
    override fun isValid(
        value: Any?,
        annotationMetadata: AnnotationValue<UniqueElement>,
        context: ConstraintValidatorContext
    ): Boolean {
        return with(annotationMetadata) {
            try {
                manager.createQuery(
                    "from ${valOf("domain")} k where k.${valOf("fieldName")} = :value"
                ).setParameter("value", value).singleResult

                throw AlreadyExistsException(valOf("message"))
            } catch (e: NoResultException) { true }
        }
    }
}