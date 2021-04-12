package br.com.zup.pix.retrieve.intern;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/pix/retrieve/intern/RetrieveEndpoint;", "Lbr/com/zup/KeymgrInternReadServiceGrpc$KeymgrInternReadServiceImplBase;", "service", "Lbr/com/zup/pix/retrieve/intern/RetrieveService;", "(Lbr/com/zup/pix/retrieve/intern/RetrieveService;)V", "read", "", "request", "Lbr/com/zup/KeymgrInternReadRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zup/KeymgrReadResponse;", "keymgr"})
@javax.inject.Singleton()
@br.com.zup.exception.ErrorHandler()
public class RetrieveEndpoint extends br.com.zup.KeymgrInternReadServiceGrpc.KeymgrInternReadServiceImplBase {
    private final br.com.zup.pix.retrieve.intern.RetrieveService service = null;
    
    @java.lang.Override()
    public void read(@org.jetbrains.annotations.NotNull()
    br.com.zup.KeymgrInternReadRequest request, @org.jetbrains.annotations.NotNull()
    io.grpc.stub.StreamObserver<br.com.zup.KeymgrReadResponse> responseObserver) {
    }
    
    public RetrieveEndpoint(@org.jetbrains.annotations.NotNull()
    br.com.zup.pix.retrieve.intern.RetrieveService service) {
        super();
    }
}