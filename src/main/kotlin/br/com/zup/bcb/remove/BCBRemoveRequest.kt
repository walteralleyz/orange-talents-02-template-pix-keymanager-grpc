package br.com.zup.bcb.remove

import br.com.zup.pix.Pix

data class BCBRemoveRequest(
    val key: String,
    val participant: String
)

fun convertToBCBRemoveRequest(pix: Pix) = BCBRemoveRequest(pix.pix, pix.accountInfo.ispb)