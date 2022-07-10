package com.corbinhughes.kafkademo

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.kafka.core.KafkaTemplate

@SpringBootApplication
class KafkaDemoApplication(private val kafkaTemplate: KafkaTemplate<Any, Any>) /* : CommandLineRunner */ {
	@Bean
	fun topic() = NewTopic("example", 10, 1)

//	override fun run(vararg args: String?) {
//		kafkaTemplate.send
//	}
}

fun main(args: Array<String>) {
	runApplication<KafkaDemoApplication>(*args)

//	val msg = secondMsg {
//		blah = 3
//	}
}