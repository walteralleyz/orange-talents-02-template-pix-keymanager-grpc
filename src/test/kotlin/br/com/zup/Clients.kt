package br.com.zup

import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import io.micronaut.grpc.server.GrpcServerChannel

@Factory
class Clients {
    @Bean
    fun grpcRegistry(
        @GrpcChannel(GrpcServerChannel.NAME) channel: ManagedChannel
    ): KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub {
        return KeymgrRegistryServiceGrpc.newBlockingStub(channel)
    }

    @Bean
    fun grpcRemove(
        @GrpcChannel(GrpcServerChannel.NAME) channel: ManagedChannel
    ): KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub {
        return KeymgrRemoveServiceGrpc.newBlockingStub(channel)
    }

    @Bean
    fun grpcRetrieve(
        @GrpcChannel(GrpcServerChannel.NAME) channel: ManagedChannel
    ): KeymgrInternReadServiceGrpc.KeymgrInternReadServiceBlockingStub {
        return KeymgrInternReadServiceGrpc.newBlockingStub(channel)
    }

    @Bean
    fun grpcExtern(
        @GrpcChannel(GrpcServerChannel.NAME) channel: ManagedChannel
    ): KeymgrExternReadServiceGrpc.KeymgrExternReadServiceBlockingStub {
        return KeymgrExternReadServiceGrpc.newBlockingStub(channel)
    }

    @Bean
    fun grpcList(
        @GrpcChannel(GrpcServerChannel.NAME) channel: ManagedChannel
    ): KeymgrReadAllServiceGrpc.KeymgrReadAllServiceBlockingStub {
        return KeymgrReadAllServiceGrpc.newBlockingStub(channel)
    }
}