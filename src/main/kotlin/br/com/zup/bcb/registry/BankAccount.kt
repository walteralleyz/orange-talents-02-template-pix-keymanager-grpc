package br.com.zup.bcb.registry

import br.com.zup.AccountType

data class BankAccount(
    val participant: String,
    val branch: String,
    val accountNumber: String,
    val accountType: AccountType
)
