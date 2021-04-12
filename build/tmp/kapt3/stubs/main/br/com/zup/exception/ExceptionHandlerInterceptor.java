package br.com.zup.exception;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\nB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0016R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/exception/ExceptionHandlerInterceptor;", "Lio/micronaut/aop/MethodInterceptor;", "Lio/grpc/BindableService;", "", "resolver", "Lbr/com/zup/exception/ExceptionHandlerResolver;", "(Lbr/com/zup/exception/ExceptionHandlerResolver;)V", "intercept", "context", "Lio/micronaut/aop/MethodInvocationContext;", "GrpcEndpointArguments", "keymgr"})
@javax.inject.Singleton()
public final class ExceptionHandlerInterceptor implements io.micronaut.aop.MethodInterceptor<io.grpc.BindableService, java.lang.Object> {
    @javax.inject.Inject()
    private final br.com.zup.exception.ExceptionHandlerResolver resolver = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object intercept(@org.jetbrains.annotations.NotNull()
    io.micronaut.aop.MethodInvocationContext<io.grpc.BindableService, java.lang.Object> context) {
        return null;
    }
    
    public ExceptionHandlerInterceptor(@org.jetbrains.annotations.NotNull()
    br.com.zup.exception.ExceptionHandlerResolver resolver) {
        super();
    }
    
    /**
     * Represents the endpoint method arguments
     */
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tR\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lbr/com/zup/exception/ExceptionHandlerInterceptor$GrpcEndpointArguments;", "", "context", "Lio/micronaut/aop/MethodInvocationContext;", "Lio/grpc/BindableService;", "(Lio/micronaut/aop/MethodInvocationContext;)V", "getContext", "()Lio/micronaut/aop/MethodInvocationContext;", "response", "Lio/grpc/stub/StreamObserver;", "keymgr"})
    static final class GrpcEndpointArguments {
        @org.jetbrains.annotations.NotNull()
        private final io.micronaut.aop.MethodInvocationContext<io.grpc.BindableService, java.lang.Object> context = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.grpc.stub.StreamObserver<?> response() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.micronaut.aop.MethodInvocationContext<io.grpc.BindableService, java.lang.Object> getContext() {
            return null;
        }
        
        public GrpcEndpointArguments(@org.jetbrains.annotations.NotNull()
        io.micronaut.aop.MethodInvocationContext<io.grpc.BindableService, java.lang.Object> context) {
            super();
        }
    }
}