package com.derek.kotlin.backend.data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class UserModel(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = -1,

        var name: String = "",

        var username :String = "",

        var password :String ="",

        var address: String = "",

        var phone: String = "",

        var balance: Double = 0.0

)