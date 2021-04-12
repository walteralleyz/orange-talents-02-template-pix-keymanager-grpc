package br.com.zup.utils

import br.com.zup.*
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@MicronautTest
class ExtensionsTest {

    @Test
    fun `is enum readable`() {
        assertEquals("CONTA_CORRENTE", AccountType.CACC.readable())
        assertEquals("CONTA_POUPANCA", AccountType.SVGS.readable())
    }

    @Test
    fun `should transform request in validated object`() {
        val registryRequest = KeymgrRegistryRequest.newBuilder().setPix("asfsfsdf").build().toValidatedEntity()
        val removeRequest = KeymgrExcludeRequest.newBuilder().setClientId("asfsfsdf").build().toValidatedEntity()
        val readAllRequest = KeymgrReadAllRequest.newBuilder().setClientId("asfsfsdf").build().toValidatedEntity()
        val readRequest = KeymgrInternReadRequest.newBuilder().setClientId("asfsfsdf").build().toValidatedEntity()

        assertEquals("asfsfsdf", registryRequest.pix)
        assertEquals("asfsfsdf", removeRequest.clientId)
        assertEquals("asfsfsdf", readAllRequest.clientId)
        assertEquals("asfsfsdf", readRequest.clientId)
    }
}