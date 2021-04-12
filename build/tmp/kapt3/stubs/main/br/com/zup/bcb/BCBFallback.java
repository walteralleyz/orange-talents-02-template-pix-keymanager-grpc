package br.com.zup.bcb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\u000f"}, d2 = {"Lbr/com/zup/bcb/BCBFallback;", "Lbr/com/zup/bcb/BCBClient;", "()V", "create", "Lio/micronaut/http/HttpResponse;", "Lbr/com/zup/bcb/registry/BCBRegistryResponse;", "request", "Lbr/com/zup/bcb/registry/BCBRegistryRequest;", "remove", "Lbr/com/zup/bcb/remove/BCBRemoveResponse;", "id", "", "Lbr/com/zup/bcb/remove/BCBRemoveRequest;", "retrieve", "Lbr/com/zup/bcb/retrieve/BCBRetrieveResponse;", "keymgr"})
@io.micronaut.retry.annotation.Fallback()
public class BCBFallback implements br.com.zup.bcb.BCBClient {
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.micronaut.http.HttpResponse<br.com.zup.bcb.registry.BCBRegistryResponse> create(@org.jetbrains.annotations.NotNull()
    br.com.zup.bcb.registry.BCBRegistryRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.micronaut.http.HttpResponse<br.com.zup.bcb.remove.BCBRemoveResponse> remove(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    br.com.zup.bcb.remove.BCBRemoveRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.micronaut.http.HttpResponse<br.com.zup.bcb.retrieve.BCBRetrieveResponse> retrieve(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public BCBFallback() {
        super();
    }
}