package br.com.zup.pix.endpoint;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007J\b\u0010\u000f\u001a\u00020\rH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zup/pix/endpoint/RegistryEndpointTest;", "", "grpcRegistry", "Lbr/com/zup/KeymgrRegistryServiceGrpc$KeymgrRegistryServiceBlockingStub;", "grpcRemove", "Lbr/com/zup/KeymgrRemoveServiceGrpc$KeymgrRemoveServiceBlockingStub;", "manager", "Ljavax/persistence/EntityManager;", "transactional", "Lio/micronaut/transaction/SynchronousTransactionManager;", "Ljava/sql/Connection;", "(Lbr/com/zup/KeymgrRegistryServiceGrpc$KeymgrRegistryServiceBlockingStub;Lbr/com/zup/KeymgrRemoveServiceGrpc$KeymgrRemoveServiceBlockingStub;Ljavax/persistence/EntityManager;Lio/micronaut/transaction/SynchronousTransactionManager;)V", "should not registry a key with wrong client id", "", "should not registry the same pix key", "should registry a new key", "keymgr"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest(transactional = false)
public final class RegistryEndpointTest {
    private final br.com.zup.KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub grpcRegistry = null;
    private final br.com.zup.KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub grpcRemove = null;
    private final javax.persistence.EntityManager manager = null;
    private final io.micronaut.transaction.SynchronousTransactionManager<java.sql.Connection> transactional = null;
    
    public RegistryEndpointTest(@org.jetbrains.annotations.NotNull()
    br.com.zup.KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub grpcRegistry, @org.jetbrains.annotations.NotNull()
    br.com.zup.KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub grpcRemove, @org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager manager, @org.jetbrains.annotations.NotNull()
    io.micronaut.transaction.SynchronousTransactionManager<java.sql.Connection> transactional) {
        super();
    }
}