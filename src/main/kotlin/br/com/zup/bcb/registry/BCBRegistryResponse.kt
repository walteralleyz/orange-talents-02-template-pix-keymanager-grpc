package br.com.zup.bcb.registry

import br.com.zup.KeyType

data class BCBRegistryResponse(
    val keyType: KeyType,
    val key: String,
    val bankAccount: BankAccount,
    val owner: Owner,
    val createdAt: String
)
