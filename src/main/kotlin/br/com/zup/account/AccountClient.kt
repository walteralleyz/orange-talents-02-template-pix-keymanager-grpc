package br.com.zup.account

import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.Fallback
import io.micronaut.retry.annotation.Recoverable

@Recoverable
@Client("http://localhost:9091/api/v1/clientes")
interface AccountClient {

    @Get("/{id}/contas{?tipo}")
    fun getById(@PathVariable id: String, @QueryValue tipo: String): AccountResponse?
}

@Fallback
class AccountFallback : AccountClient {
    override fun getById(id: String, tipo: String): AccountResponse? = null
}