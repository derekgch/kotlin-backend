package com.derek.kotlin.backend.config

import com.derek.kotlin.backend.BookStoreModel
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer  

@Configuration  
open class RestConfiguration : RepositoryRestConfigurer {  
  override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?) {  
    config?.exposeIdsFor(BookStoreModel::class.java)
    config?.setBasePath("/api"); 
  }  
}