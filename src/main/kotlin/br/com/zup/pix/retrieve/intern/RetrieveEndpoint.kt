package br.com.zup.pix.retrieve.intern

import br.com.zup.KeymgrInternReadRequest
import br.com.zup.KeymgrInternReadServiceGrpc
import br.com.zup.KeymgrReadResponse
import br.com.zup.exception.ErrorHandler
import br.com.zup.utils.toValidatedEntity
import io.grpc.stub.StreamObserver
import javax.inject.Singleton

@ErrorHandler
@Singleton
class RetrieveEndpoint(private val service: RetrieveService) : KeymgrInternReadServiceGrpc.KeymgrInternReadServiceImplBase() {
    override fun read(request: KeymgrInternReadRequest, responseObserver: StreamObserver<KeymgrReadResponse>) {
        if(request.id == 0 || request.clientId.isNullOrBlank()) throw IllegalArgumentException("Requisição vazia")

        service.read(request.toValidatedEntity()).let {
            responseObserver.onNext(it)
            responseObserver.onCompleted()
        }
    }
}