package br.com.zup.exception.internal


fun makeException(exception: ExceptionType, message: String? = null): RuntimeException {
    val alreadyExistsMessage = "Já cadastrado no sistema"
    val notFoundMessage = "Não encontrado"
    val requestMessage = "Não foi possivel remover essa chave dos nossos registros"
    val notPermittedMessage = "Chave pix não encontrada para usuário"

    return when(exception) {
        ExceptionType.ALREADY_EXISTS -> AlreadyExistsException(message ?: alreadyExistsMessage)
        ExceptionType.REQUEST -> RequestException(message ?: requestMessage)
        ExceptionType.NOT_FOUND -> NotFoundException(message ?: notFoundMessage)
        ExceptionType.NOT_PERMITTED -> NotPermittedException(message ?: notPermittedMessage)
    }
}

enum class ExceptionType {
    NOT_FOUND,
    ALREADY_EXISTS,
    NOT_PERMITTED,
    REQUEST
}