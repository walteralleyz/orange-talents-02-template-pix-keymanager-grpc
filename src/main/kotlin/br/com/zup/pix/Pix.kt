package br.com.zup.pix

import br.com.zup.*
import br.com.zup.account.Account
import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Pix(
    @Column(unique = true)
    val pix: String,

    @Enumerated(EnumType.STRING)
    val pixType: KeyType,

    val clientId: String,

    @Enumerated(EnumType.STRING)
    val accountType: AccountType,

    @OneToOne(cascade = [CascadeType.MERGE])
    val accountInfo: Account
) {

    @Id @GeneratedValue
    val id: Int? = null

    val createdAt: LocalDateTime = LocalDateTime.now()

    fun toResponse(): KeymgrRegistryResponse = KeymgrRegistryResponse.newBuilder().setId(id!!).build()

    override fun toString(): String {
        return "pix=$pix\npixKeyType=$pixType\nclient=$clientId\naccount=$accountType\n$accountInfo"
    }
}