package br.com.zup.pix.endpoint;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/pix/endpoint/ExternEndpointTest;", "", "grpcRegistry", "Lbr/com/zup/KeymgrRegistryServiceGrpc$KeymgrRegistryServiceBlockingStub;", "grpcRemove", "Lbr/com/zup/KeymgrRemoveServiceGrpc$KeymgrRemoveServiceBlockingStub;", "grpcExtern", "Lbr/com/zup/KeymgrExternReadServiceGrpc$KeymgrExternReadServiceBlockingStub;", "(Lbr/com/zup/KeymgrRegistryServiceGrpc$KeymgrRegistryServiceBlockingStub;Lbr/com/zup/KeymgrRemoveServiceGrpc$KeymgrRemoveServiceBlockingStub;Lbr/com/zup/KeymgrExternReadServiceGrpc$KeymgrExternReadServiceBlockingStub;)V", "should retrieve some registered pix from external api", "", "keymgr"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest()
public final class ExternEndpointTest {
    private final br.com.zup.KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub grpcRegistry = null;
    private final br.com.zup.KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub grpcRemove = null;
    private final br.com.zup.KeymgrExternReadServiceGrpc.KeymgrExternReadServiceBlockingStub grpcExtern = null;
    
    public ExternEndpointTest(@org.jetbrains.annotations.NotNull()
    br.com.zup.KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub grpcRegistry, @org.jetbrains.annotations.NotNull()
    br.com.zup.KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub grpcRemove, @org.jetbrains.annotations.NotNull()
    br.com.zup.KeymgrExternReadServiceGrpc.KeymgrExternReadServiceBlockingStub grpcExtern) {
        super();
    }
}