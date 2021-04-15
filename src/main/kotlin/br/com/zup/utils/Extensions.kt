package br.com.zup.utils

import br.com.zup.*
import br.com.zup.bcb.BCBClient
import br.com.zup.exception.internal.ExceptionType
import br.com.zup.exception.internal.makeException
import br.com.zup.pix.list.ListValidatedRequest
import br.com.zup.pix.retrieve.extern.RetrieveValidatedRequest as RetrieveExternal
import br.com.zup.pix.registry.RegistryValidatedRequest
import br.com.zup.pix.remove.RemoveValidatedRequest
import br.com.zup.pix.retrieve.intern.RetrieveValidatedRequest
import io.micronaut.core.annotation.AnnotationValue


fun KeymgrRegistryRequest.toValidatedEntity(): RegistryValidatedRequest = RegistryValidatedRequest(
    this.pix,
    this.pixType,
    this.clientId,
    this.accountType
)

fun KeymgrExcludeRequest.toValidatedEntity(): RemoveValidatedRequest = RemoveValidatedRequest(
    this.pix,
    this.clientId
)

fun KeymgrInternReadRequest.toValidatedEntity(): RetrieveValidatedRequest = RetrieveValidatedRequest(
    this.id,
    this.clientId
)

fun KeymgrExternReadRequest.toValidatedEntity(): RetrieveExternal = RetrieveExternal(this.pix)

fun KeymgrReadAllRequest.toValidatedEntity(): ListValidatedRequest = ListValidatedRequest(this.clientId)

fun AnnotationValue<*>.valOf(value: String) = this.stringValue(value).get()

fun AccountType.readable() : String {
    return if(this == AccountType.CACC) "CONTA_CORRENTE"
    else "CONTA_POUPANCA"
}