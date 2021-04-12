package br.com.zup.account;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lbr/com/zup/account/AccountFallback;", "Lbr/com/zup/account/AccountClient;", "()V", "getById", "Lbr/com/zup/account/AccountResponse;", "id", "", "tipo", "keymgr"})
@io.micronaut.retry.annotation.Fallback()
public class AccountFallback implements br.com.zup.account.AccountClient {
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public br.com.zup.account.AccountResponse getById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String tipo) {
        return null;
    }
    
    public AccountFallback() {
        super();
    }
}