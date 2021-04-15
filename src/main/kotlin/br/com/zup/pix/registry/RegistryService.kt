package br.com.zup.pix.registry

import br.com.zup.KeymgrRegistryResponse
import br.com.zup.account.AccountClient
import br.com.zup.account.convertToAccount
import br.com.zup.bcb.*
import br.com.zup.bcb.registry.convertToBCBRegistryRequest
import br.com.zup.exception.internal.AlreadyExistsException
import br.com.zup.exception.internal.NotFoundException
import br.com.zup.exception.internal.RequestException
import br.com.zup.repository.PixRepository
import br.com.zup.utils.readable
import io.micronaut.validation.Validated
import javax.inject.Singleton
import javax.validation.Valid

@Validated
@Singleton
class RegistryService(
    private val repository: PixRepository,
    private val accountClient: AccountClient,
    private val bcbClient: BCBClient
) {

    fun create(@Valid req: RegistryValidatedRequest): KeymgrRegistryResponse {
        val account = accountClient.getById(req.clientId, req.accountType.readable())
                ?: throw NotFoundException("Cliente não encontrado")

        val bcbResponse = bcbClient.create(convertToBCBRegistryRequest(req.toModel(req.pix, convertToAccount(account))))
            ?: throw AlreadyExistsException("Chave já registrada no BCB")

        return repository.save(req.toModel(bcbResponse.body.get().key, convertToAccount(account))).toResponse()
    }
}