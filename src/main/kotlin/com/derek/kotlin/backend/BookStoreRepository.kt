package com.derek.kotlin.backend

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "bookstores", path = "bookstores")

interface BookStoreRepository : CrudRepository <BookStoreModel, Long >
