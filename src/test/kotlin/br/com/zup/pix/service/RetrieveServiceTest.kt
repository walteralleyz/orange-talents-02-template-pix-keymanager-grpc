package br.com.zup.pix.service

import br.com.zup.*
import br.com.zup.account.Account
import br.com.zup.exception.internal.NotFoundException
import br.com.zup.pix.Pix
import br.com.zup.pix.retrieve.intern.RetrieveService
import br.com.zup.pix.retrieve.intern.RetrieveValidatedRequest
import br.com.zup.repository.PixRepository
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import javax.validation.ConstraintViolationException

@MicronautTest(transactional = false)
class RetrieveServiceTest(
    private val service: RetrieveService,
    private val grpcRegistry: KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub,
    private val grpcRemove: KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub,
    private val repo: PixRepository
) {

    companion object {
        var id: Int = 0
    }

    @BeforeEach
    fun setup() {
        id = grpcRegistry.registry(KeymgrRegistryRequest.newBuilder()
            .setPix("11122233344")
            .setPixType(KeyType.CPF)
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .setAccountType(AccountType.CACC)
            .build()
        ).id
    }

    @AfterEach
    fun destroy() {
        grpcRemove.remove(KeymgrExcludeRequest.newBuilder()
            .setPix("11122233344")
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .build()
        )
    }

    @Test
    fun `should return an obj fulfilled`() {
        RetrieveValidatedRequest(id, "c56dfef4-7901-44fb-84e2-a2cefb157890").let {
            service.read(it)
        }.let {
            assertNotNull(it)
            assertEquals("c56dfef4-7901-44fb-84e2-a2cefb157890", it.clientId)
        }
    }

    @Test
    fun `should throw a validation error`() {
        assertThrows<ConstraintViolationException> {
            service.read(RetrieveValidatedRequest(0, ""))
        }
    }

    @Test
    fun `should throw a bcb not found error`() {
        val model = repo.save(Pix(
            "12345678911",
            KeyType.CPF,
            "assdfsdfsdfa",
            AccountType.CACC,
            Account(
                "assdfsdfsdfa",
                "walter",
                "12345678911",
                "ITAU",
                "035465",
                "1000",
                "12345",
            )
        ))

        assertThrows<NotFoundException> {
            service.read(RetrieveValidatedRequest(model.id!!, model.clientId))
        }.let {
            assertEquals(it.message, "Não encontrado")
        }

        repo.remove(model.pix)
    }
}