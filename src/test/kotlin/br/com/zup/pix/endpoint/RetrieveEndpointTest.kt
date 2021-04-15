package br.com.zup.pix.endpoint

import br.com.zup.*
import br.com.zup.account.Account
import br.com.zup.pix.Pix
import br.com.zup.repository.PixRepository
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@MicronautTest(transactional = false)
class RetrieveEndpointTest(
    private val grpcRetrieve: KeymgrInternReadServiceGrpc.KeymgrInternReadServiceBlockingStub,
    private val grpcRegistry: KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub,
    private val grpcRemove: KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub,
    private val repo: PixRepository
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
    fun `should throw an error by invalid obj`() {
        assertThrows<StatusRuntimeException> {
            grpcRetrieve.read(KeymgrInternReadRequest.newBuilder().build())
        }.run {
            assertEquals(Status.INVALID_ARGUMENT.code, this.status.code)
            assertEquals("Requisição vazia", this.status.description)
        }
    }

    @Test
    fun `should retrieve some registered pix`() {
        grpcRetrieve.read(KeymgrInternReadRequest.newBuilder()
            .setId(repo.findByPix("11122233344")!!.id!!)
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .build()
        ).let {
            assertEquals("c56dfef4-7901-44fb-84e2-a2cefb157890", it.clientId)
        }
    }

    @Test
    fun `should throw an error not found`() {
        assertThrows<StatusRuntimeException> {
            grpcRetrieve.read(KeymgrInternReadRequest.newBuilder()
                .setId(1)
                .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
                .build()
            )
        }.run {
            assertEquals(Status.PERMISSION_DENIED.code, this.status.code)
        }
    }

    @Test
    fun `should throw an error for pix not match client`() {
        assertThrows<StatusRuntimeException> {
            grpcRetrieve.read(KeymgrInternReadRequest.newBuilder()
                .setId(1)
                .setClientId("asdfasdfsdf")
                .build()
            )
        }.run {
            assertEquals(Status.PERMISSION_DENIED.code, this.status.code)
            assertEquals("Chave pix não encontrada para usuário", this.status.description)
        }
    }
}