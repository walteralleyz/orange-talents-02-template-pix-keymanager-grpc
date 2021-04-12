package br.com.zup.exception.handler

import br.com.zup.exception.internal.NotFoundException
import br.com.zup.exception.ExceptionHandler
import io.grpc.Status
import javax.inject.Singleton

@Singleton
class NotFoundExceptionHandler : ExceptionHandler<NotFoundException> {
    override fun handle(e: NotFoundException): ExceptionHandler.StatusWithDetails {
        return ExceptionHandler.StatusWithDetails(
            Status.NOT_FOUND
                .withDescription(e.message)
                .withCause(e)
        )
    }

    override fun supports(e: Exception): Boolean {
        return e is NotFoundException
    }

}