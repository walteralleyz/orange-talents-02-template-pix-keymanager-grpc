package br.com.zup.pix.retrieve.extern

import br.com.zup.KeymgrExternReadRequest
import br.com.zup.KeymgrExternReadServiceGrpc
import br.com.zup.KeymgrReadResponse
import br.com.zup.exception.ErrorHandler
import br.com.zup.utils.toValidatedEntity
import io.grpc.stub.StreamObserver
import javax.inject.Singleton

@ErrorHandler
@Singleton
class RetrieveEndpoint(private val service: RetrieveService) : KeymgrExternReadServiceGrpc.KeymgrExternReadServiceImplBase() {
    override fun read(request: KeymgrExternReadRequest, responseObserver: StreamObserver<KeymgrReadResponse>) {
        if(request.pix.isNullOrBlank()) throw IllegalArgumentException("Requisição vazia")

        service.retrieve(request.toValidatedEntity()).let {
            responseObserver.onNext(it)
            responseObserver.onCompleted()
        }
    }
}