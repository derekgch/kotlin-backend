package com.derek.kotlin.backend.config

import com.derek.kotlin.backend.data.BookStoreModel
import com.derek.kotlin.backend.data.UserModel
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer  

@Configuration  
open class RestConfiguration : RepositoryRestConfigurer {  
  override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?) {
    config?.exposeIdsFor(BookStoreModel::class.java)
    config?.exposeIdsFor(UserModel::class.java)

    config?.setBasePath("/api"); 
  }  
}