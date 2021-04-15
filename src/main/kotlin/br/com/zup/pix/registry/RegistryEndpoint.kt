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
            responseObserver.onError(
                Status.INVALID_ARGUMENT
                    .withDescription(it)
                    .asRuntimeException()
            )


            return
        }

        isAccountValid(req.accountType)?.let {
            responseObserver.onError(
                Status.INVALID_ARGUMENT
                    .withDescription(it)
                    .asRuntimeException()
            )

            return
        }

        service.create(req.toValidatedEntity()).let {
            responseObserver.onNext(it)
            responseObserver.onCompleted()
        }
    }
}