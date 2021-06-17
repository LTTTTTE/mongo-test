package com.example.mongotest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongotestApplication

fun main(args: Array<String>) {
    runApplication<MongotestApplication>(*args)
}
