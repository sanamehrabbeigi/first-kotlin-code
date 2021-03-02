package ir.sana.config.mongodb

import nonapi.io.github.classgraph.json.Id
import org.bison.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime


@config
data class participants (
    @Id
    val id:ObjectId = ObjectId.get(),
    val name: String,
    val familyName : String,
    val age: String
)