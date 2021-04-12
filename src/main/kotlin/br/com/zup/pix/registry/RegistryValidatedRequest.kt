package br.com.zup.pix.registry

import br.com.zup.AccountType
import br.com.zup.KeyType
import br.com.zup.account.Account
import br.com.zup.annotation.UniqueElement
import br.com.zup.pix.Pix
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Introspected
data class RegistryValidatedRequest(
    @field:Size(max = 77)
    val pix: String,

    @field:NotNull
    val pixType: KeyType,

    @field:NotBlank
    val clientId: String,

    @field:NotNull
    val accountType: AccountType
) {
    fun toModel(pixKey: String, account: Account): Pix = Pix(
        pixKey,
        pixType,
        clientId,
        accountType,
        account
    )
}