package com.derek.kotlin.backend

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class BackendApplication {

  @Bean
  fun run(repository: BookStoreRepository) = ApplicationRunner {
    repository.save(BookStoreModel(
      name = "Bucks",
      address = "123 W 83th St, Boulder, CO 55555",
      phone = "566-343-2375",
      priceOfGiftCard = 1.30,
      numberOfBooks = 100,
      powerAccessible = true,
      internetReliability = 5
    ))

    repository.save(BookStoreModel(
      name = "Jue's Book",
      address = "111 Fierce Blvd, Town, NC 00923",
      phone = "113-254-4645",
      priceOfGiftCard = 2.40,
      numberOfBooks = 200,
      powerAccessible = true,
      internetReliability = 5
    ))
  }
}

fun main(args: Array<String>) {
  runApplication<BackendApplication>(*args)
}
