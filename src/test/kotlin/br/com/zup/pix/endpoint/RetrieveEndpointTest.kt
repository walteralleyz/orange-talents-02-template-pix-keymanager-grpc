package br.com.zup.pix.endpoint

import br.com.zup.*
import br.com.zup.account.Account
import br.com.zup.pix.Pix
import br.com.zup.repository.PixRepository
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@MicronautTest
class RetrieveEndpointTest(
    private val grpcRetrieve: KeymgrInternReadServiceGrpc.KeymgrInternReadServiceBlockingStub,
    private val grpcRegistry: KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub,
    private val grpcRemove: KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub,
    private val repo: PixRepository
) {

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
        grpcRegistry.registry(
            KeymgrRegistryRequest.newBuilder()
            .setPix("54555658451")
            .setPixType(KeyType.CPF)
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .setAccountType(AccountType.CACC)
            .build()
        )

        grpcRetrieve.read(KeymgrInternReadRequest.newBuilder()
            .setId(repo.findByPix("54555658451")!!.id!!)
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .build()
        ).let {
            grpcRemove.remove(KeymgrExcludeRequest.newBuilder()
                .setPix("54555658451")
                .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
                .build()
            )

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
            assertEquals(this.status.code, Status.NOT_FOUND.code)
        }
    }

    @Test
    fun `should throw an error from bcb api`() {
        repo.save(
            Pix(
            "12345679811",
            KeyType.CPF,
            "asdfqwerqwer",
            AccountType.CACC,
            Account(
                "asdfqwerqwer",
                "Walter",
                "12345679811",
                "ITAU",
                "102201",
                "0001",
                "29012"
            )
        )
        )

        assertThrows<StatusRuntimeException> {
            grpcRetrieve.read(KeymgrInternReadRequest.newBuilder()
                .setId(1)
                .setClientId("asdfqwerqwer")
                .build()
            )
        }.run {
            repo.remove("12345679811")

            assertEquals(Status.NOT_FOUND.code, this.status.code)
        }
    }

    @Test
    fun `should throw an error for pix not match client`() {
        grpcRegistry.registry(
            KeymgrRegistryRequest.newBuilder()
                .setPix("11111111111")
                .setPixType(KeyType.CPF)
                .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
                .setAccountType(AccountType.CACC)
                .build()
        )

        assertThrows<StatusRuntimeException> {
            grpcRetrieve.read(KeymgrInternReadRequest.newBuilder()
                .setId(1)
                .setClientId("asdfasdfsdf")
                .build()
            )
        }.run {
            grpcRemove.remove(KeymgrExcludeRequest.newBuilder()
                .setPix("11111111111")
                .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
                .build()
            )

            assertEquals(this.status.code, Status.PERMISSION_DENIED.code)
        }
    }
}