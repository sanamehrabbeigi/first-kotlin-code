package ir.sana

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
class myapp
fun main()
{
    println("hello sepehr!")
    SpringApplicationBuilder(myapp::class.java).run()

}