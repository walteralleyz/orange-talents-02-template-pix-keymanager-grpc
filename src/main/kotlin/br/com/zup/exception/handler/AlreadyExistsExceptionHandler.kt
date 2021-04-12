package br.com.zup.exception.handler

import br.com.zup.exception.ExceptionHandler
import br.com.zup.exception.internal.AlreadyExistsException
import io.grpc.Status
import javax.inject.Singleton

@Singleton
class AlreadyExistsExceptionHandler : ExceptionHandler<AlreadyExistsException> {
    override fun handle(e: AlreadyExistsException): ExceptionHandler.StatusWithDetails {
        return ExceptionHandler.StatusWithDetails(
            Status.ALREADY_EXISTS
                .withDescription(e.message)
                .withCause(e)
        )
    }

    override fun supports(e: Exception): Boolean {
        return e is AlreadyExistsException
    }

}