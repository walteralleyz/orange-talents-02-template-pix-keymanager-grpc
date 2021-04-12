package br.com.zup.bcb.registry

import br.com.zup.KeyType
import br.com.zup.bcb.registry.BankAccount
import br.com.zup.pix.Pix

data class BCBRegistryRequest(
    val keyType: KeyType,
    val key: String,
    val bankAccount: BankAccount,
    val owner: Owner
)

fun convertToBCBRegistryRequest(pix: Pix): BCBRegistryRequest = BCBRegistryRequest(
    pix.pixType,
    pix.pix,
    BankAccount(
        pix.accountInfo.ispb,
        pix.accountInfo.branch,
        pix.accountInfo.accountNumber,
        pix.accountType
    ),
    Owner(name = pix.accountInfo.client, taxIdNumber = pix.accountInfo.cpf)
)
