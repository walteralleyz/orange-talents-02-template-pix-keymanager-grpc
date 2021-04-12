package br.com.zup.bcb.retrieve

import br.com.zup.KeyType
import br.com.zup.bcb.registry.BankAccount
import br.com.zup.bcb.registry.Owner

data class BCBRetrieveResponse(
    val keyType: KeyType,
    val key: String,
    val bankAccount: BankAccount,
    val owner: Owner,
    val createdAt: String
)
