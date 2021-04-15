package br.com.zup.pix.endpoint

import br.com.zup.*
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@MicronautTest
class ListEndpointTest(
    private val grpcList: KeymgrReadAllServiceGrpc.KeymgrReadAllServiceBlockingStub,
    private val grpcRegistry: KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub,
    private val grpcRemove: KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub
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
    fun `should return an empty list`() {
        assertEquals(0,
            grpcList.readAll(KeymgrReadAllRequest.newBuilder().setClientId("asdfwe").build())
                .responseList.size
        )
    }

    @Test
    fun `should throw an error for blank client`() {
        assertThrows<StatusRuntimeException> {
            grpcList.readAll(KeymgrReadAllRequest.newBuilder().build())
        }.let {
            assertEquals(Status.INVALID_ARGUMENT.code, it.status.code)
            assertEquals("ClientId precisa ser preenchido", it.status.description)
        }
    }

    @Test
    fun `should return an array filled with one response`() {
        grpcList.readAll(KeymgrReadAllRequest.newBuilder()
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .build()
        ).let {
            assertEquals(1, it.responseList.size)
            assertEquals("c56dfef4-7901-44fb-84e2-a2cefb157890", it.responseList[0].clientId)
        }
    }
}