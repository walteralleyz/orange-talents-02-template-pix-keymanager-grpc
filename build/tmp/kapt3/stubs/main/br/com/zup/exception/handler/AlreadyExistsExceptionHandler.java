package br.com.zup.exception.handler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\u0006\u001a\u00060\tj\u0002`\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/exception/handler/AlreadyExistsExceptionHandler;", "Lbr/com/zup/exception/ExceptionHandler;", "Lbr/com/zup/exception/internal/AlreadyExistsException;", "()V", "handle", "Lbr/com/zup/exception/ExceptionHandler$StatusWithDetails;", "e", "supports", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "keymgr"})
@javax.inject.Singleton()
public final class AlreadyExistsExceptionHandler implements br.com.zup.exception.ExceptionHandler<br.com.zup.exception.internal.AlreadyExistsException> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.exception.ExceptionHandler.StatusWithDetails handle(@org.jetbrains.annotations.NotNull()
    br.com.zup.exception.internal.AlreadyExistsException e) {
        return null;
    }
    
    @java.lang.Override()
    public boolean supports(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
        return false;
    }
    
    public AlreadyExistsExceptionHandler() {
        super();
    }
}