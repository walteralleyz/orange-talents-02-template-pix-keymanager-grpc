package br.com.zup.utils

import br.com.zup.AccountType
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@MicronautTest
class AccountTypeValidatorTest {

    @Test
    fun `should return a error message`() {
        var message = isAccountValid(AccountType.UNRECOGNIZED)
        assertEquals("Tipo de conta não suportado", message)

        message = isAccountValid(AccountType.ACCOUNT)
        assertEquals("Tipo de conta não suportado", message)

    }
}