package br.com.zup.utils

import br.com.zup.KeyType

fun isValidPixKey(pixId: String?, pixType: KeyType?): String? {
    return when(pixType) {
        KeyType.CPF -> validatePixKeyCPF(pixId)
        KeyType.EMAIL -> validatePixKeyEmail(pixId)
        KeyType.PHONE -> validatePixKeyPhone(pixId)
        KeyType.UUID -> validatePixKeyUUID(pixId)
        else -> "Identificador não reconhecido"
    }
}

fun validatePixKeyCPF(pixId: String?): String? {
    if(pixId.isNullOrBlank()) return "Chave pix não preenchida"
    if(!pixId.matches("^[0-9]{11}$".toRegex())) return "CPF deve ter formato válido"

    return null
}

fun validatePixKeyEmail(pixId: String?): String? {
    if(pixId.isNullOrBlank()) return "Chave pix não preenchida"
    if(!pixId.matches("^[A-Za-z0-9+_.-]+@(.+)\$".toRegex())) return "Email deve ter formato válido"

    return null
}

fun validatePixKeyPhone(pixId: String?): String? {
    if(pixId.isNullOrBlank()) return "Chave pix não preenchida"
    if(!pixId.matches("^\\+[1-9][0-9]\\d{1,14}\$".toRegex())) return "Telefone deve ter formato válido"

    return null
}

fun validatePixKeyUUID(pixId: String?): String? {
    if(pixId.isNullOrBlank()) return null

    return "Tipo UUID não pode ser preenchido"
}