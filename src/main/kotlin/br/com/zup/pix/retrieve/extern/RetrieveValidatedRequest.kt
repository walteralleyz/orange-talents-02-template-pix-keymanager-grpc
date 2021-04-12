package br.com.zup.pix.retrieve.extern

import br.com.zup.AccountInfo
import br.com.zup.KeymgrReadResponse
import br.com.zup.pix.Pix
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Introspected
data class RetrieveValidatedRequest(
    @field:NotBlank @field:Size(max = 77)
    val pix: String
) {
    fun toResponse(pix: Pix): KeymgrReadResponse = KeymgrReadResponse.newBuilder()
        .setClientId(pix.clientId)
        .setPixType(pix.pixType)
        .setPix(pix.pix)
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