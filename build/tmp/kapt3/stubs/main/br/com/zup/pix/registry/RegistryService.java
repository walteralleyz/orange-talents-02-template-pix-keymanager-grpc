package br.com.zup.pix.registry;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lbr/com/zup/pix/registry/RegistryService;", "", "repository", "Lbr/com/zup/repository/PixRepository;", "accountClient", "Lbr/com/zup/account/AccountClient;", "bcbClient", "Lbr/com/zup/bcb/BCBClient;", "(Lbr/com/zup/repository/PixRepository;Lbr/com/zup/account/AccountClient;Lbr/com/zup/bcb/BCBClient;)V", "create", "Lbr/com/zup/KeymgrRegistryResponse;", "req", "Lbr/com/zup/pix/registry/RegistryValidatedRequest;", "keymgr"})
@javax.inject.Singleton()
@io.micronaut.validation.Validated()
public class RegistryService {
    private final br.com.zup.repository.PixRepository repository = null;
    private final br.com.zup.account.AccountClient accountClient = null;
    private final br.com.zup.bcb.BCBClient bcbClient = null;
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.KeymgrRegistryResponse create(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    br.com.zup.pix.registry.RegistryValidatedRequest req) {
        return null;
    }
    
    public RegistryService(@org.jetbrains.annotations.NotNull()
    br.com.zup.repository.PixRepository repository, @org.jetbrains.annotations.NotNull()
    br.com.zup.account.AccountClient accountClient, @org.jetbrains.annotations.NotNull()
    br.com.zup.bcb.BCBClient bcbClient) {
        super();
    }
}