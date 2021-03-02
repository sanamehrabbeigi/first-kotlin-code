package ir.sana.repository

import ir.sana.config.mongodb.participants
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface participantsRepository : MongoRepository<participants, String> {
    fun findOneById(id: ObjectId): participants
    override fun deleteAll()
}