package br.com.zup.pix.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/pix/list/ListEndpoint;", "Lbr/com/zup/KeymgrReadAllServiceGrpc$KeymgrReadAllServiceImplBase;", "service", "Lbr/com/zup/pix/list/ListService;", "(Lbr/com/zup/pix/list/ListService;)V", "readAll", "", "request", "Lbr/com/zup/KeymgrReadAllRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zup/KeymgrReadAllResponse;", "keymgr"})
@javax.inject.Singleton()
@br.com.zup.exception.ErrorHandler()
public class ListEndpoint extends br.com.zup.KeymgrReadAllServiceGrpc.KeymgrReadAllServiceImplBase {
    private final br.com.zup.pix.list.ListService service = null;
    
    @java.lang.Override()
    public void readAll(@org.jetbrains.annotations.NotNull()
    br.com.zup.KeymgrReadAllRequest request, @org.jetbrains.annotations.NotNull()
    io.grpc.stub.StreamObserver<br.com.zup.KeymgrReadAllResponse> responseObserver) {
    }
    
    public ListEndpoint(@org.jetbrains.annotations.NotNull()
    br.com.zup.pix.list.ListService service) {
        super();
    }
}