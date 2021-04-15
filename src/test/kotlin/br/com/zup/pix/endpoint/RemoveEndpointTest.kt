package br.com.zup.pix.endpoint

import br.com.zup.*
import br.com.zup.account.Account
import br.com.zup.exception.internal.RequestException
import br.com.zup.pix.Pix
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import io.micronaut.transaction.SynchronousTransactionManager
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.sql.Connection
import javax.persistence.EntityManager

@MicronautTest(transactional = false)
class RemoveEndpointTest(
    private val grpcRemove: KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub,
    private val grpcRegistry: KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub,
    private val manager: EntityManager,
    private val transactional: SynchronousTransactionManager<Connection>
) {

    @Test
    fun `should delete a registered pix key`() {
        grpcRegistry.registry(KeymgrRegistryRequest.newBuilder()
            .setPix("86135457004")
            .setPixType(KeyType.CPF)
            .setClientId("5260263c-a3c1-4727-ae32-3bdb2538841b")
            .setAccountType(AccountType.CACC)
            .build()
        )

        grpcRemove.remove(KeymgrExcludeRequest.newBuilder()
            .setPix("86135457004")
            .setClientId("5260263c-a3c1-4727-ae32-3bdb2538841b")
            .build()
        )

        transactional.executeRead {
            manager.createQuery("from Pix where pix = :pix", Pix::class.java)
                .setParameter("pix", "86135457004").resultList
        }.let {
            assertEquals(0, it.size)
        }
    }

    @Test
    fun `should throw an error with wrong pix`() {
        assertThrows<StatusRuntimeException> {
            grpcRemove.remove(KeymgrExcludeRequest.newBuilder()
                .setPix("12341234214")
                .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
                .build()
            )
        }.let {
            assertEquals(Status.PERMISSION_DENIED.code, it.status.code)
            assertEquals("Chave pix não encontrada para usuário", it.status.description)
        }
    }

    @Test
    fun `should throw and error with key not in bcb`() {
        transactional.executeWrite {
            manager.merge(
                Pix(
                "11111111111",
                KeyType.CPF,
                "qwerqwerqwer",
                AccountType.CACC,
                Account(
                    "qwerqwerqwer",
                    "Walter",
                    "11111111111",
                    "ITAU",
                    "102201",
                    "0001",
                    "29012"
                )
            )
            )
        }

        assertThrows<StatusRuntimeException> {
            grpcRemove.remove(KeymgrExcludeRequest.newBuilder()
                .setPix("11111111111")
                .setClientId("qwerqwerqwer")
                .build()
            )
        }.run {
            assertEquals(Status.NOT_FOUND.code, this.status.code)
            assertEquals(this.status.description, "Não foi possivel remover essa chave dos nossos registros")
        }
    }

    @Test
    fun `should throw an error for invalid request`() {
        assertThrows<StatusRuntimeException> {
            grpcRemove.remove(KeymgrExcludeRequest.newBuilder().build())
        }.let { assertEquals("Todos os dados devem ser preenchidos", it.status.description) }
    }
}