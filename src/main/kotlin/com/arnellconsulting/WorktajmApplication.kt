package com.arnellconsulting

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class WorktajmApplication

fun main(args: Array<String>) {
    SpringApplication.run(WorktajmApplication::class.java, *args)
}
