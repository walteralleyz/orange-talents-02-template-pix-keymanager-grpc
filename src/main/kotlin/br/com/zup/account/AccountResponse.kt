package br.com.zup.account

data class AccountResponse(
    val tipo: String,
    val instituicao: AccountBank,
    val agencia: String,
    val numero: String,
    val titular: Owner
)