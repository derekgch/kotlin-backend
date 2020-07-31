
package com.derek.kotlin.backend.data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class BookStoreModel(

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id: Long = -1,

  var name: String = "",

  var address: String = "",

  var phone: String = "",

  var priceOfGiftCard: Double = 0.0,

  var numberOfBooks: Int = 0,

  var powerAccessible: Boolean = true,

  var internetReliability: Short = 3 // 1-5

)
