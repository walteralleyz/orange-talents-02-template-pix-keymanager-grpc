package br.com.zup.repository

import br.com.zup.pix.Pix
import io.micronaut.data.annotation.Repository
import io.micronaut.transaction.SynchronousTransactionManager
import java.sql.Connection
import javax.persistence.EntityManager
import javax.persistence.NoResultException

@Repository
open class PixRepository(
    private val entityManager: EntityManager,
    private val transactionManager: SynchronousTransactionManager<Connection>
) {
    fun save(pix: Pix): Pix {
        return transactionManager.executeWrite { entityManager.merge(pix) }
    }

    fun findByPix(pix: String): Pix? {
        return transactionManager.executeRead {
            try {
                entityManager.createQuery(
                    "from Pix p where p.pix = :id",
                    Pix::class.java
                ).setParameter("id", pix).singleResult
            } catch (e: NoResultException) { null }
        }
    }

    fun findByPixAndClient(pix: String, client: String): Pix? {
        return transactionManager.executeRead {
            try {
                entityManager.createQuery(
                    "from Pix p where p.pix = :pix and p.clientId = :client",
                    Pix::class.java
                ).setParameter("pix", pix).setParameter("client", client).singleResult
            } catch (e: NoResultException) { null }
        }
    }

    fun findByPixIdAndClient(id: Int, client: String): Pix? {
        return transactionManager.executeRead {
            try {
                entityManager.createQuery(
                    "from Pix p where p.id = :id and p.clientId = :client",
                    Pix::class.java
                ).setParameter("id", id).setParameter("client", client).singleResult
            } catch (e: NoResultException) { null }
        }
    }

    fun findByClientId(id: String): List<Pix> {
        return transactionManager.executeRead {
            entityManager.createQuery(
                "from Pix p where p.clientId = :id",
                Pix::class.java
            ).setParameter("id", id).resultList
        }
    }

    fun remove(pix: String) {
        transactionManager.executeWrite {
            entityManager.createQuery("delete from Pix p where p.pix = :pix")
                .setParameter("pix", pix)
                .executeUpdate()
        }
    }
}