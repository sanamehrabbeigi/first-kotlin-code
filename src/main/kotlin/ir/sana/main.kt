package ir.sana

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
class myapp

fun main()
{
    SpringApplicationBuilder(myapp::class.java).run()
}