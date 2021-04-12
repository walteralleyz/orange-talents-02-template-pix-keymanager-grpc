package br.com.zup.exception.internal


fun makeException(exception: String, message: String? = null): RuntimeException {
    val alreadyExistsMessage = "Já cadastrado no sistema"
    val notFoundMessage = "Não encontrado"
    val requestMessage = "Não foi possivel remover essa chave dos nossos registros"
    val notPermittedMessage = "Chave pix não encontrada para usuário"

    return when(exception.toLowerCase()) {
        "already" -> AlreadyExistsException(message ?: alreadyExistsMessage)
        "request" -> RequestException(message ?: requestMessage)
        "found" -> NotFoundException(message ?: notFoundMessage)
        "forbidden" -> NotPermittedException(message ?: notPermittedMessage)
        else -> NotFoundException(message ?: notFoundMessage)
    }
}