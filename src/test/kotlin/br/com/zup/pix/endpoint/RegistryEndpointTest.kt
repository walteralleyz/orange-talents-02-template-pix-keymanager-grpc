package br.com.zup.pix.endpoint

import br.com.zup.*
import br.com.zup.pix.Pix
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import io.micronaut.transaction.SynchronousTransactionManager
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
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
            grpcRemove.remove(KeymgrExcludeRequest.newBuilder()
                .setPix("54555658451")
                .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
                .build()
            )

            assertEquals(it[1].pix, "54555658451")
            assertEquals(it.size, 2)
        }
    }

    @Test
    fun `should not registry the same pix key`() {
        assertThrows<StatusRuntimeException> {
            grpcRegistry.registry(KeymgrRegistryRequest.newBuilder()
                .setPix("11122233344")
                .setPixType(KeyType.CPF)
                .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
                .setAccountType(AccountType.CACC)
                .build()
            )
        }.let {
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

    @Test
    fun `should not registry with wrong pix type`() {
        assertThrows<StatusRuntimeException> {
            grpcRegistry.registry(KeymgrRegistryRequest.newBuilder()
                .setPix("asdfsdfd")
                .setPixType(KeyType.CPF)
                .setClientId("adsfsdfsdf")
                .setAccountType(AccountType.CACC)
                .build()
            )
        }.let {
            assertEquals(Status.INVALID_ARGUMENT.code, it.status.code)
            assertEquals("CPF deve ter formato válido", it.status.description)
        }
    }

    @Test
    fun `should not registry with wrong account type`() {
        assertThrows<StatusRuntimeException> {
            grpcRegistry.registry(KeymgrRegistryRequest.newBuilder()
                .setPix("11122233344")
                .setPixType(KeyType.CPF)
                .setClientId("adsfsdfsdf")
                .setAccountType(AccountType.ACCOUNT)
                .build()
            )
        }.let {
            assertEquals(Status.INVALID_ARGUMENT.code, it.status.code)
            assertEquals("Tipo de conta não suportado", it.status.description)
        }
    }
}