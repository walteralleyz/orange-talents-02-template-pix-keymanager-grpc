package br.com.zup.pix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u0003H\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006!"}, d2 = {"Lbr/com/zup/pix/Pix;", "", "pix", "", "pixType", "Lbr/com/zup/KeyType;", "clientId", "accountType", "Lbr/com/zup/AccountType;", "accountInfo", "Lbr/com/zup/account/Account;", "createdAt", "Ljava/time/LocalDateTime;", "(Ljava/lang/String;Lbr/com/zup/KeyType;Ljava/lang/String;Lbr/com/zup/AccountType;Lbr/com/zup/account/Account;Ljava/time/LocalDateTime;)V", "getAccountInfo", "()Lbr/com/zup/account/Account;", "getAccountType", "()Lbr/com/zup/AccountType;", "getClientId", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "id", "", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPix", "getPixType", "()Lbr/com/zup/KeyType;", "toResponse", "Lbr/com/zup/KeymgrRegistryResponse;", "toString", "keymgr"})
@javax.persistence.Entity()
public final class Pix {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue()
    @javax.persistence.Id()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Column(unique = true)
    private final java.lang.String pix = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private final br.com.zup.KeyType pixType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String clientId = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private final br.com.zup.AccountType accountType = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.MERGE})
    private final br.com.zup.account.Account accountInfo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.time.LocalDateTime createdAt = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.KeymgrRegistryResponse toResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.account.Account getAccountInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    public Pix(@org.jetbrains.annotations.NotNull()
    java.lang.String pix, @org.jetbrains.annotations.NotNull()
    br.com.zup.KeyType pixType, @org.jetbrains.annotations.NotNull()
    java.lang.String clientId, @org.jetbrains.annotations.NotNull()
    br.com.zup.AccountType accountType, @org.jetbrains.annotations.NotNull()
    br.com.zup.account.Account accountInfo, @org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime createdAt) {
        super();
    }
}