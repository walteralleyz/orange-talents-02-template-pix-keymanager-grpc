package br.com.zup.pix.endpoint

import br.com.zup.*
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@MicronautTest(transactional = false)
class ExternEndpointTest(
    private val grpcRegistry: KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub,
    private val grpcRemove: KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub,
    private val grpcExtern: KeymgrExternReadServiceGrpc.KeymgrExternReadServiceBlockingStub
) {

    @BeforeEach
    fun setup() {
        grpcRegistry.registry(KeymgrRegistryRequest.newBuilder()
            .setPix("11122233344")
            .setPixType(KeyType.CPF)
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .setAccountType(AccountType.CACC)
            .build()
        )
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
    fun `should retrieve some registered pix from external api`() {
        grpcExtern.read(
            KeymgrExternReadRequest.newBuilder()
            .setPix("11122233344")
            .build()
        ).let {
            assertEquals("c56dfef4-7901-44fb-84e2-a2cefb157890", it.clientId)
        }
    }
}