package br.com.zup.account

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "accounts")
class Account(
    @Id
    val id: String,
    val client: String,
    val cpf: String,
    val bank: String,
    val ispb: String,
    val branch: String,
    val accountNumber: String
) {
    override fun toString(): String {
        return "id=$id\nclient=$client\ncpf=$cpf\nbank=$bank\nispb=$ispb\nbranch=$branch\naccountNumber=$accountNumber"
    }
}

fun convertToAccount(accountResponse: AccountResponse): Account = Account(
    accountResponse.titular.id,
    accountResponse.titular.nome,
    accountResponse.titular.cpf,
    accountResponse.instituicao.nome,
    accountResponse.instituicao.ispb,
    accountResponse.agencia,
    accountResponse.numero
)