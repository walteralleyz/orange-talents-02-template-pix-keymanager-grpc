package br.com.zup.repository

import br.com.zup.AccountType
import br.com.zup.KeyType
import br.com.zup.account.Account
import br.com.zup.pix.Pix
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

@MicronautTest
class PixRepositoryTest(
    private val repo: PixRepository
) {

    @Test
    fun `should register a new key`() {
        repo.save(Pix(
            "12345679811",
            KeyType.CPF,
            "asdfqwerqwer",
            AccountType.CACC,
            Account(
                "asdfqwerqwer",
                "Walter",
                "12345679811",
                "ITAU",
                "102201",
                "0001",
                "29012"
            )
        ))

        repo.findByPix("12345679811")?.let {
            assertNotNull(it)
            assertEquals("asdfqwerqwer", it.clientId)
            assertNotNull(it.accountInfo)
        }
    }

    @Test
    fun `should delete a existing key`() {
        repo.remove("12345679811")

        assertNull(repo.findByPix("12345679811"))
    }
}