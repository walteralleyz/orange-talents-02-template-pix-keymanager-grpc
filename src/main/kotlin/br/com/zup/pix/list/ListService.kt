package br.com.zup.pix.list

import br.com.zup.KeymgrReadAllResponse
import br.com.zup.repository.PixRepository
import io.micronaut.validation.Validated
import javax.inject.Singleton
import javax.validation.Valid

@Validated
@Singleton
class ListService(private val repo: PixRepository) {

    fun all(@Valid req: ListValidatedRequest): KeymgrReadAllResponse {
        return repo.findByClientId(req.clientId).let { pix ->
            req.toResponse(pix)
        }
    }
}