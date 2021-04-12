package br.com.zup.account;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\'\u00a8\u0006\u0007"}, d2 = {"Lbr/com/zup/account/AccountClient;", "", "getById", "Lbr/com/zup/account/AccountResponse;", "id", "", "tipo", "keymgr"})
@io.micronaut.http.client.annotation.Client(value = "http://localhost:9091/api/v1/clientes")
@io.micronaut.retry.annotation.Recoverable()
public abstract interface AccountClient {
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(value = "/{id}/contas{?tipo}")
    public abstract br.com.zup.account.AccountResponse getById(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue()
    java.lang.String tipo);
}