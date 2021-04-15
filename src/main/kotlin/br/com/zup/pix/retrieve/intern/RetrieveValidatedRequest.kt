package br.com.zup.pix.retrieve.intern

import br.com.zup.AccountInfo
import br.com.zup.KeymgrReadResponse
import br.com.zup.pix.Pix
import com.sun.istack.NotNull
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank

@Introspected
data class RetrieveValidatedRequest(
    @field:NotNull
    val id: Int,

    @field:NotBlank
    val clientId: String
) {
    fun toResponse(pix: Pix): KeymgrReadResponse = KeymgrReadResponse.newBuilder()
        .setId(pix.id!!)
        .setClientId(pix.clientId)
        .setPixType(pix.pixType)
        .setPix(pix.pix)
        .setCreatedAt(pix.createdAt.toString())
        .setAccountInfo(AccountInfo.newBuilder()
            .setAccountType(pix.accountType)
            .setName(pix.accountInfo.client)
            .setCpf(pix.accountInfo.cpf)
            .setBankName(pix.accountInfo.bank)
            .setBranch(pix.accountInfo.branch)
            .setAccountNumber(pix.accountInfo.accountNumber)
            .build()
        ).build()
}
