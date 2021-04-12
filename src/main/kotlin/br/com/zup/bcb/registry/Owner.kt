package br.com.zup.bcb.registry

data class Owner(
    val type: String = "NATURAL_PERSON",
    val name: String,
    val taxIdNumber: String
)
