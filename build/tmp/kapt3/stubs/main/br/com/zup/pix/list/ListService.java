package br.com.zup.pix.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbr/com/zup/pix/list/ListService;", "", "repo", "Lbr/com/zup/repository/PixRepository;", "(Lbr/com/zup/repository/PixRepository;)V", "all", "Lbr/com/zup/KeymgrReadAllResponse;", "req", "Lbr/com/zup/pix/list/ListValidatedRequest;", "keymgr"})
@javax.inject.Singleton()
@io.micronaut.validation.Validated()
public class ListService {
    private final br.com.zup.repository.PixRepository repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.KeymgrReadAllResponse all(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    br.com.zup.pix.list.ListValidatedRequest req) {
        return null;
    }
    
    public ListService(@org.jetbrains.annotations.NotNull()
    br.com.zup.repository.PixRepository repo) {
        super();
    }
}