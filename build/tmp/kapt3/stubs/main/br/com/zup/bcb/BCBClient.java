package br.com.zup.bcb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J$\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u000bH\'J\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000e"}, d2 = {"Lbr/com/zup/bcb/BCBClient;", "", "create", "Lio/micronaut/http/HttpResponse;", "Lbr/com/zup/bcb/registry/BCBRegistryResponse;", "request", "Lbr/com/zup/bcb/registry/BCBRegistryRequest;", "remove", "Lbr/com/zup/bcb/remove/BCBRemoveResponse;", "id", "", "Lbr/com/zup/bcb/remove/BCBRemoveRequest;", "retrieve", "Lbr/com/zup/bcb/retrieve/BCBRetrieveResponse;", "keymgr"})
@io.micronaut.http.client.annotation.Client(value = "http://localhost:8082/api/v1/pix/keys")
@io.micronaut.retry.annotation.Recoverable()
public abstract interface BCBClient {
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Post(processes = {"application/xml"})
    public abstract io.micronaut.http.HttpResponse<br.com.zup.bcb.registry.BCBRegistryResponse> create(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    br.com.zup.bcb.registry.BCBRegistryRequest request);
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Delete(uri = "/{id}", processes = {"application/xml"})
    public abstract io.micronaut.http.HttpResponse<br.com.zup.bcb.remove.BCBRemoveResponse> remove(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    br.com.zup.bcb.remove.BCBRemoveRequest request);
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(uri = "/{id}", processes = {"application/xml"})
    public abstract io.micronaut.http.HttpResponse<br.com.zup.bcb.retrieve.BCBRetrieveResponse> retrieve(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String id);
}