package br.com.zup.pix.registry

import br.com.zup.*
import br.com.zup.exception.ErrorHandler
import br.com.zup.utils.*
import io.grpc.Status
import io.grpc.stub.StreamObserver
import javax.inject.Singleton

@ErrorHandler
@Singleton
class RegistryEndpoint(private val service: RegistryService) : KeymgrRegistryServiceGrpc.KeymgrRegistryServiceImplBase() {
    override fun registry(req: KeymgrRegistryRequest, responseObserver: StreamObserver<KeymgrRegistryResponse>) {
        isValidPixKey(req.pix, req.pixType)?.let {
            errorResponse(responseObserver, it, Status.INVALID_ARGUMENT)

            return
        }

        isAccountValid(req.accountType)?.let {
            errorResponse(responseObserver, it, Status.INVALID_ARGUMENT)

            return
        }

        service.create(req.toValidatedEntity()).let {
            responseObserver.onNext(it)
            responseObserver.onCompleted()
        }
    }
}