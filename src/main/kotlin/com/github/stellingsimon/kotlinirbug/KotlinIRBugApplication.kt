package com.github.stellingsimon.kotlinirbug

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional

@SpringBootApplication
class KotlinIRBugApplication

fun main(args: Array<String>) {
	runApplication<KotlinIRBugApplication>(*args)
}

class Event

@Service
class SomeService {

	@MyAnnotation("value given")
	fun on(event: Event) {}
}

@Target(AnnotationTarget.FUNCTION)
@Transactional(propagation = Propagation.NOT_SUPPORTED)
annotation class MyAnnotation(
	val myAnnotationProperty: String,
)