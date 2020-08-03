package com.derek.kotlin.backend.data


import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "users", path = "users")

interface UserRepository : CrudRepository <UserModel, Long >
