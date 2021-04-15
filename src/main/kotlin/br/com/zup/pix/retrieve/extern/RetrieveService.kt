package br.com.zup.pix.retrieve.extern

import br.com.zup.KeymgrReadResponse
import br.com.zup.bcb.BCBClient
import br.com.zup.exception.internal.ExceptionType.*
import br.com.zup.exception.internal.NotFoundException
import br.com.zup.exception.internal.makeException
import br.com.zup.repository.PixRepository
import io.micronaut.validation.Validated
import javax.inject.Singleton
import javax.validation.Valid

@Validated
@Singleton
class RetrieveService(
    private val repo: PixRepository,
    private val bcbClient: BCBClient
) {

    fun retrieve(@Valid req: RetrieveValidatedRequest): KeymgrReadResponse {
        val pix = repo.findByPix(req.pix) ?: throw NotFoundException("Chave nao encontrada")

        bcbClient.retrieve(pix.pix)?.let { it.body.orElseThrow { makeException(NOT_FOUND) } }

        return req.toResponse(pix)
    }
}