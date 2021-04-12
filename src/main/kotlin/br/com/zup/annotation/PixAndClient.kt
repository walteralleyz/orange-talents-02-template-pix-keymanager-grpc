package br.com.zup.annotation

import br.com.zup.exception.internal.NotFoundException
import br.com.zup.pix.remove.RemoveValidatedRequest
import br.com.zup.utils.valOf

import io.micronaut.core.annotation.AnnotationValue
import io.micronaut.validation.validator.constraints.ConstraintValidator
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext
import javax.inject.Singleton
import javax.persistence.EntityManager
import javax.persistence.NoResultException
import javax.transaction.Transactional
import javax.validation.Constraint
import kotlin.annotation.AnnotationTarget.*
import kotlin.annotation.AnnotationRetention.RUNTIME

@Constraint(validatedBy = [PixAndClientValidation::class])
@Retention(RUNTIME)
@Target(TYPE, CLASS)
annotation class PixAndClient(
    val message: String = "Message Default",
    val domain: String
)

@Singleton
open class PixAndClientValidation(private val manager: EntityManager) : ConstraintValidator<PixAndClient, RemoveValidatedRequest> {

    @Transactional
    override fun isValid(
        value: RemoveValidatedRequest,
        annotationMetadata: AnnotationValue<PixAndClient>,
        context: ConstraintValidatorContext
    ): Boolean {
        return with(annotationMetadata) {
            try {
                manager.createQuery("from ${valOf("domain")} k where k.pixKeyId = :pix and k.clientId = :client")
                    .setParameter("pix", value.pix)
                    .setParameter("client", value.clientId)
                    .singleResult
                true
            } catch (e: NoResultException) { throw NotFoundException(valOf("message")) }
        }
    }
}
