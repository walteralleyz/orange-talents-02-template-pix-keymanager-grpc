package br.com.zup.pix.registry;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fJ\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006!"}, d2 = {"Lbr/com/zup/pix/registry/RegistryValidatedRequest;", "", "pix", "", "pixType", "Lbr/com/zup/KeyType;", "clientId", "accountType", "Lbr/com/zup/AccountType;", "(Ljava/lang/String;Lbr/com/zup/KeyType;Ljava/lang/String;Lbr/com/zup/AccountType;)V", "getAccountType", "()Lbr/com/zup/AccountType;", "getClientId", "()Ljava/lang/String;", "getPix", "getPixType", "()Lbr/com/zup/KeyType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toModel", "Lbr/com/zup/pix/Pix;", "pixKey", "account", "Lbr/com/zup/account/Account;", "toString", "keymgr"})
@io.micronaut.core.annotation.Introspected()
public final class RegistryValidatedRequest {
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(max = 77)
    private final java.lang.String pix = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotNull()
    private final br.com.zup.KeyType pixType = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    private final java.lang.String clientId = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotNull()
    private final br.com.zup.AccountType accountType = null;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.pix.Pix toModel(@org.jetbrains.annotations.NotNull()
    java.lang.String pixKey, @org.jetbrains.annotations.NotNull()
    br.com.zup.account.Account account) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.KeyType getPixType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClientId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.AccountType getAccountType() {
        return null;
    }
    
    public RegistryValidatedRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String pix, @org.jetbrains.annotations.NotNull()
    br.com.zup.KeyType pixType, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    br.com.zup.AccountType accountType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.KeyType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.AccountType component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.pix.registry.RegistryValidatedRequest copy(@org.jetbrains.annotations.NotNull()
    java.lang.String pix, @org.jetbrains.annotations.NotNull()
    br.com.zup.KeyType pixType, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    br.com.zup.AccountType accountType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}