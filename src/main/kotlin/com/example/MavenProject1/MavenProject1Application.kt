package com.example.MavenProject1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MavenProject1Application

fun main(args: Array<String>) {
	runApplication<MavenProject1Application>(*args)
	println("Good morning Hyd")
}
