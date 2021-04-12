package br.com.zup.utils

import br.com.zup.AccountType

fun isAccountValid(type: AccountType): String? {
    return when(type) {
        AccountType.UNRECOGNIZED -> "Tipo de conta não suportado";
        AccountType.ACCOUNT -> "Tipo de conta não suportado";
        else -> null
    }
}