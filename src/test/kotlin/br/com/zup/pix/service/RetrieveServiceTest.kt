package br.com.zup.pix.service

import br.com.zup.*
import br.com.zup.pix.retrieve.intern.RetrieveService
import br.com.zup.pix.retrieve.intern.RetrieveValidatedRequest
import io.grpc.Status
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import javax.validation.ConstraintViolationException

@MicronautTest
class RetrieveServiceTest(
    private val service: RetrieveService,
    private val grpcRegistry: KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub,
    private val grpcRemove: KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub
) {

    @Test
    fun `should return an obj fulfilled`() {
        grpcRegistry.registry(
            KeymgrRegistryRequest.newBuilder()
            .setPix("54555658451")
            .setPixType(KeyType.CPF)
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .setAccountType(AccountType.CACC)
            .build()
        )

        RetrieveValidatedRequest(1, "c56dfef4-7901-44fb-84e2-a2cefb157890").let {
            service.read(it)
        }.let {
            assertNotNull(it)
            assertEquals("c56dfef4-7901-44fb-84e2-a2cefb157890", it.clientId)
        }

        grpcRemove.remove(KeymgrExcludeRequest.newBuilder()
            .setPix("54555658451")
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .build()
        )
    }

    @Test
    fun `should throw a validation error`() {
        assertThrows<ConstraintViolationException> {
            service.read(RetrieveValidatedRequest(0, ""))
        }
    }
}