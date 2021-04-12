package br.com.zup.pix.list

import br.com.zup.KeymgrReadAllRequest
import br.com.zup.KeymgrReadAllResponse
import br.com.zup.KeymgrReadAllServiceGrpc
import br.com.zup.exception.ErrorHandler
import br.com.zup.utils.toValidatedEntity
import io.grpc.stub.StreamObserver
import javax.inject.Singleton

@ErrorHandler
@Singleton
class ListEndpoint(private val service: ListService) : KeymgrReadAllServiceGrpc.KeymgrReadAllServiceImplBase() {
    override fun readAll(request: KeymgrReadAllRequest, responseObserver: StreamObserver<KeymgrReadAllResponse>) {
        if(request.clientId.isNullOrBlank())
            throw IllegalArgumentException("ClientId precisa ser preenchido")

        service.all(request.toValidatedEntity()).let {
            responseObserver.onNext(it)
            responseObserver.onCompleted()
        }
    }
}