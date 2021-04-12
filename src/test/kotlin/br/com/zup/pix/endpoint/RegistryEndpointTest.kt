package br.com.zup.pix.endpoint

import br.com.zup.*
import br.com.zup.pix.Pix
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import io.micronaut.transaction.SynchronousTransactionManager
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows
import java.sql.Connection
import javax.persistence.EntityManager

@MicronautTest(transactional = false)
class RegistryEndpointTest(
    private val grpcRegistry: KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub,
    private val grpcRemove: KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub,
    private val manager: EntityManager,
    private val transactional: SynchronousTransactionManager<Connection>
) {

    @Test
    fun `should registry a new key`() {
        grpcRegistry.registry(KeymgrRegistryRequest.newBuilder()
            .setPix("54555658451")
            .setPixType(KeyType.CPF)
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .setAccountType(AccountType.CACC)
            .build()
        ).let {
            with(it) {
                assertNotNull(id)
            }
        }

        transactional.executeRead {
            manager.createQuery("from Pix", Pix::class.java)
                .resultList
        }.let {
            assertEquals(it[0].pix, "54555658451")
            assertEquals(it.size, 1)
        }
    }

    @Test
    fun `should not registry the same pix key`() {
        assertThrows<StatusRuntimeException> {
            grpcRegistry.registry(KeymgrRegistryRequest.newBuilder()
                .setPix("54555658451")
                .setPixType(KeyType.CPF)
                .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
                .setAccountType(AccountType.CACC)
                .build()
            )
        }.let {
            grpcRemove.remove(KeymgrExcludeRequest.newBuilder()
                .setPix("54555658451")
                .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
                .build()
            )

            assertEquals(Status.ALREADY_EXISTS.code, it.status.code)
            assertEquals("Chave já registrada no BCB", it.status.description)
        }
    }

    @Test
    fun `should not registry a key with wrong client id`() {
        assertThrows<StatusRuntimeException> {
            grpcRegistry.registry(KeymgrRegistryRequest.newBuilder()
                .setPix("56482421325")
                .setPixType(KeyType.CPF)
                .setClientId("adsfsdfsdf")
                .setAccountType(AccountType.CACC)
                .build()
            )
        }.let {
            assertEquals(Status.NOT_FOUND.code, it.status.code)
            assertEquals("Cliente não encontrado", it.status.description)
        }
    }
}