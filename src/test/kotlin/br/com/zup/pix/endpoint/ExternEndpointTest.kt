package br.com.zup.pix.endpoint

import br.com.zup.*
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

@MicronautTest
class ExternEndpointTest(
    private val grpcRegistry: KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub,
    private val grpcRemove: KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub,
    private val grpcExtern: KeymgrExternReadServiceGrpc.KeymgrExternReadServiceBlockingStub
) {

    @Test
    fun `should retrieve some registered pix from external api`() {
        grpcRegistry.registry(
            KeymgrRegistryRequest.newBuilder()
                .setPix("11111111111")
                .setPixType(KeyType.CPF)
                .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
                .setAccountType(AccountType.CACC)
                .build()
        )

        grpcExtern.read(
            KeymgrExternReadRequest.newBuilder()
            .setPix("11111111111")
            .build()
        ).let {
            grpcRemove.remove(
                KeymgrExcludeRequest.newBuilder()
                    .setPix("11111111111")
                    .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
                    .build()
            )

            Assertions.assertEquals("c56dfef4-7901-44fb-84e2-a2cefb157890", it.clientId)
        }
    }
}