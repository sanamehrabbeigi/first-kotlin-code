package ir.sana.controller

import ir.sana.annotation.ApiMapping
import ir.sana.config.mongodb.participants
import ir.sana.config.mongodb.participantsMongoDbFactory
import ir.sana.repository.participantsRepository
import org.bson.types.ObjectId
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

//var translatedWord = ""

//val words = setOf( "hello", "cat", "dog", "sun", "blue")

//@ApiMapping
//class Mycontroller {
//    @GetMapping("rest")
//    fun get(): ResponseEntity<String> {
//        return ResponseEntity("welcome!", HttpStatus.OK)
//    }
//
//    @PostMapping("rest/{word}")
//    fun post(
//        @PathVariable word: String,
//        @RequestBody language: String
//    ): ResponseEntity<String> {
//        when(language){
//            "chinese" -> { when(word) {
//                            "hello" -> translatedWord = "你好"
//                            "cat" -> translatedWord = "猫"
//                            "dog" -> translatedWord = "狗"
//                            "sun" -> translatedWord = "太阳"
//                            "blue" -> translatedWord = "蓝色"
//                            else -> translatedWord = "Not supported!"
//                            }
//
//            }
//            "italian" -> { when(word) {
//                            "hello" -> translatedWord = "Ciao"
//                            "cat" -> translatedWord = "gatta-gatto"
//                            "dog" -> translatedWord = "cagna-cane"
//                            "sun" -> translatedWord = "sole"
//                            "blue" -> translatedWord = "blu"
//                            else -> translatedWord = "Not supported!"
//                            }
//            }
//            else -> translatedWord = "Not supported!"
//        }
//        return ResponseEntity("means: $translatedWord", HttpStatus.CREATED)
//    }
//}

@ApiMapping
class Mycontroller {
    @GetMapping("rest")
    fun get(): ResponseEntity<String> {
        return ResponseEntity("welcome!", HttpStatus.OK)
    }

    @PostMapping("rest/{word}")
    fun post(
        @PathVariable word: String,
        @RequestBody language: String
    ): ResponseEntity<String> {
    }
}