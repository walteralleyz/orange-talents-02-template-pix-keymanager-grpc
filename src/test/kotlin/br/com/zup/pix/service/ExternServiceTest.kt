package br.com.zup.pix.service

import br.com.zup.*
import br.com.zup.account.Account
import br.com.zup.exception.internal.NotFoundException
import br.com.zup.pix.Pix
import br.com.zup.pix.retrieve.extern.RetrieveService
import br.com.zup.pix.retrieve.extern.RetrieveValidatedRequest
import br.com.zup.repository.PixRepository
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@MicronautTest
class ExternServiceTest(
    private val grpcRegistry: KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub,
    private val grpcRemove: KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub,
    private val service: RetrieveService,
    private val repo: PixRepository
) {

    @BeforeEach
    fun setup() {
        RetrieveServiceTest.id = grpcRegistry.registry(
            KeymgrRegistryRequest.newBuilder()
            .setPix("11122233344")
            .setPixType(KeyType.CPF)
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .setAccountType(AccountType.CACC)
            .build()
        ).id
    }

    @AfterEach
    fun destroy() {
        grpcRemove.remove(
            KeymgrExcludeRequest.newBuilder()
            .setPix("11122233344")
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .build()
        )
    }

    @Test
    fun `should retrieve a registered pix`() {
        service.retrieve(RetrieveValidatedRequest("11122233344"))
            .let {
                assertNotNull(it)
                assertEquals("c56dfef4-7901-44fb-84e2-a2cefb157890", it.clientId)
            }
    }

    @Test
    fun `should throw an error for wrong pix`() {
        assertThrows<NotFoundException> {
            service.retrieve(RetrieveValidatedRequest("asdfsfdsfsd"))
        }.let { assertEquals("Chave nao encontrada", it.message) }
    }

    @Test
    fun `should throw a bcb not found error`() {
        repo.save(
            Pix(
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
        )
        )

        assertThrows<NotFoundException> {
            service.retrieve(RetrieveValidatedRequest("12345678911"))
        }.let { assertEquals("Não encontrado", it.message) }
    }
}