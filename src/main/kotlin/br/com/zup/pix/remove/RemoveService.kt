package br.com.zup.pix.remove

import br.com.zup.KeymgrExcludeResponse
import br.com.zup.bcb.BCBClient
import br.com.zup.bcb.remove.convertToBCBRemoveRequest
import br.com.zup.exception.internal.NotFoundException
import br.com.zup.exception.internal.makeException
import br.com.zup.repository.PixRepository
import io.micronaut.validation.Validated
import javax.inject.Singleton
import javax.validation.Valid

@Validated
@Singleton
class RemoveService(
    private val repo: PixRepository,
    private val bcbClient: BCBClient,
) {

    fun delete(@Valid req: RemoveValidatedRequest): KeymgrExcludeResponse {
        val pix = repo.findByPix(req.pix) ?: throw NotFoundException("Pix não registrada no sistema")

        bcbClient.remove(pix.pix, convertToBCBRemoveRequest(pix))?.let {
            it.body.orElseThrow { makeException("request") }
        } ?: throw makeException("request")

        repo.remove(pix.pix)
        return req.toResponse()
    }
}