package br.com.zup.pix.endpoint;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lbr/com/zup/pix/endpoint/RetrieveEndpointTest;", "", "grpcRetrieve", "Lbr/com/zup/KeymgrInternReadServiceGrpc$KeymgrInternReadServiceBlockingStub;", "grpcRegistry", "Lbr/com/zup/KeymgrRegistryServiceGrpc$KeymgrRegistryServiceBlockingStub;", "grpcRemove", "Lbr/com/zup/KeymgrRemoveServiceGrpc$KeymgrRemoveServiceBlockingStub;", "repo", "Lbr/com/zup/repository/PixRepository;", "(Lbr/com/zup/KeymgrInternReadServiceGrpc$KeymgrInternReadServiceBlockingStub;Lbr/com/zup/KeymgrRegistryServiceGrpc$KeymgrRegistryServiceBlockingStub;Lbr/com/zup/KeymgrRemoveServiceGrpc$KeymgrRemoveServiceBlockingStub;Lbr/com/zup/repository/PixRepository;)V", "should retrieve some registered pix", "", "should throw an error by invalid obj", "should throw an error for pix not match client", "should throw an error from bcb api", "should throw an error not found", "keymgr"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest()
public final class RetrieveEndpointTest {
    private final br.com.zup.KeymgrInternReadServiceGrpc.KeymgrInternReadServiceBlockingStub grpcRetrieve = null;
    private final br.com.zup.KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub grpcRegistry = null;
    private final br.com.zup.KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub grpcRemove = null;
    private final br.com.zup.repository.PixRepository repo = null;
    
    public RetrieveEndpointTest(@org.jetbrains.annotations.NotNull()
    br.com.zup.KeymgrInternReadServiceGrpc.KeymgrInternReadServiceBlockingStub grpcRetrieve, @org.jetbrains.annotations.NotNull()
    br.com.zup.KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub grpcRegistry, @org.jetbrains.annotations.NotNull()
    br.com.zup.KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub grpcRemove, @org.jetbrains.annotations.NotNull()
    br.com.zup.repository.PixRepository repo) {
        super();
    }
}