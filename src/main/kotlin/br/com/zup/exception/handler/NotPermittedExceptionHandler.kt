package br.com.zup.exception.handler

import br.com.zup.exception.ExceptionHandler
import br.com.zup.exception.internal.NotPermittedException
import io.grpc.Status
import javax.inject.Singleton

@Singleton
class NotPermittedExceptionHandler : ExceptionHandler<NotPermittedException> {
    override fun handle(e: NotPermittedException): ExceptionHandler.StatusWithDetails {
        return ExceptionHandler.StatusWithDetails(
            Status.PERMISSION_DENIED
                .withDescription(e.message)
                .withCause(e)
        )
    }

    override fun supports(e: Exception): Boolean = e is NotPermittedException
}