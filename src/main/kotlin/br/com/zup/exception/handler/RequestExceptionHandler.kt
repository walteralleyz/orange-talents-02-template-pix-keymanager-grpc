package br.com.zup.exception.handler

import br.com.zup.exception.internal.RequestException
import br.com.zup.exception.ExceptionHandler
import io.grpc.Status
import javax.inject.Singleton

@Singleton
class RequestExceptionHandler : ExceptionHandler<RequestException> {
    override fun handle(e: RequestException): ExceptionHandler.StatusWithDetails {
        return ExceptionHandler.StatusWithDetails(
            Status.ALREADY_EXISTS
                .withDescription(e.message)
                .withCause(e)
        )
    }

    override fun supports(e: Exception): Boolean {
        return e is RequestException
    }
}