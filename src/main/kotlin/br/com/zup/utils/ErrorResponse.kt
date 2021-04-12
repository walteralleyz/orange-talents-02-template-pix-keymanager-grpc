package br.com.zup.utils

import br.com.zup.KeymgrRegistryResponse
import io.grpc.Status
import io.grpc.stub.StreamObserver

fun errorResponse(responseObserver: StreamObserver<KeymgrRegistryResponse>, message: String, status: Status) {
    responseObserver.onError(
        status
            .withDescription(message)
            .asRuntimeException()
    )
}