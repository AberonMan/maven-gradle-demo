package ru.sberbank.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import javax.jms.Queue

@SpringBootApplication
class Demo5CustomScopeApplication {

    @Bean
    internal fun jmsBean() = Queue { "queName" }
}

fun main(args: Array<String>) {
    runApplication<Demo5CustomScopeApplication>(*args)
}