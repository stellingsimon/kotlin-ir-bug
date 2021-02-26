package com.github.stellingsimon.kotlinirbug

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

@SpringBootTest
@ExtendWith(MockitoExtension::class)
class KotlinIcBugApplicationTests {

	@MockBean
	lateinit var mockObject: SomeService

	@Test
	fun contextLoads() {}

}
