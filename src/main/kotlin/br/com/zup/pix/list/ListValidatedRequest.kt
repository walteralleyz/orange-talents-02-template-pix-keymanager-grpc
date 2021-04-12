package br.com.zup.pix.list

import br.com.zup.KeymgrReadAllResponse
import br.com.zup.ReadAllResponse
import br.com.zup.pix.Pix
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Introspected
data class ListValidatedRequest(
    @NotBlank @Size(max = 77)
    val clientId: String
) {
    fun toResponse(pix: List<Pix>): KeymgrReadAllResponse {
        return KeymgrReadAllResponse.newBuilder().let {
            if(pix.isNotEmpty()) {
                for(p in pix) {
                    it.addResponse(ReadAllResponse.newBuilder()
                        .setId(p.id!!)
                        .setClientId(p.clientId)
                        .setKeyType(p.pixType)
                        .setPix(p.pix)
                        .setAccountType(p.accountType)
                        .setCreatedAt(p.createdAt.toString())
                        .build()
                    )
                }
            }

            it.build()
        }
    }
}
