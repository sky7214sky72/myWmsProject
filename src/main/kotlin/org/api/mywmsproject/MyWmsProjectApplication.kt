package org.api.mywmsproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyWmsProjectApplication

fun main(args: Array<String>) {
	runApplication<MyWmsProjectApplication>(*args)
}
