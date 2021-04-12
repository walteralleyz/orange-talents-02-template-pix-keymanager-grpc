package br.com.zup.utils

import br.com.zup.KeyType
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@MicronautTest
class KeyValidatorTest {

    @Test
    fun `should return a message for invalid type`() {
        var message = isValidPixKey("adadfsdf", KeyType.KEY)
        assertEquals("Identificador não reconhecido", message)

        message = isValidPixKey("asdfasdfsa", KeyType.UNRECOGNIZED)
        assertEquals("Identificador não reconhecido", message)
    }

    @Test
    fun `should return cpf error`() {
        val message = isValidPixKey("asdfasdf", KeyType.CPF)
        assertEquals("CPF deve ter formato válido", message)
    }

    @Test
    fun `should return email error`() {
        val message = isValidPixKey("asdfsadf", KeyType.EMAIL)
        assertEquals("Email deve ter formato válido", message)
    }

    @Test
    fun `should return phone error`() {
        val message = isValidPixKey("asdfsaf", KeyType.PHONE)
        assertEquals("Telefone deve ter formato válido", message)
    }
}