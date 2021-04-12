package br.com.zup.bcb

import br.com.zup.bcb.registry.BCBRegistryRequest
import br.com.zup.bcb.registry.BCBRegistryResponse
import br.com.zup.bcb.remove.BCBRemoveRequest
import br.com.zup.bcb.remove.BCBRemoveResponse
import br.com.zup.bcb.retrieve.BCBRetrieveResponse
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.Fallback
import io.micronaut.retry.annotation.Recoverable

@Recoverable
@Client("http://localhost:8082/api/v1/pix/keys")
interface BCBClient {

    @Post(processes = [MediaType.APPLICATION_XML])
    fun create(@Body request: BCBRegistryRequest): HttpResponse<BCBRegistryResponse>?

    @Delete(uri = "/{id}", processes = [MediaType.APPLICATION_XML])
    fun remove(@PathVariable id: String, @Body request: BCBRemoveRequest): HttpResponse<BCBRemoveResponse>?

    @Get(uri = "/{id}", processes = [MediaType.APPLICATION_XML])
    fun retrieve(@PathVariable id: String): HttpResponse<BCBRetrieveResponse>?
}

@Fallback
class BCBFallback : BCBClient {
    override fun create(request: BCBRegistryRequest): HttpResponse<BCBRegistryResponse>? = null
    override fun remove(@PathVariable id: String, @Body request: BCBRemoveRequest): HttpResponse<BCBRemoveResponse>? = null
    override fun retrieve(id: String): HttpResponse<BCBRetrieveResponse>? = null
}