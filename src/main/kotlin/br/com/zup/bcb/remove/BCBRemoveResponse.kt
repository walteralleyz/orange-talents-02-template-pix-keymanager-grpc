package br.com.zup.bcb.remove

data class BCBRemoveResponse(
    val key: String,
    val participant: String,
    val deletedAt: String
)