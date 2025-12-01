package com.example.popcorntime.data.repository

import com.example.popcorntime.domain.repository.AuthRepository
import com.example.popcorntime.data.datasource.AuthDataSource

class AuthRepositoryImpl(
    private val remote: AuthDataSource
) : AuthRepository {
    override suspend fun login(email: String, password: String): Boolean {
        return remote.login(email, password)
    }

    override suspend fun register(email: String, password: String): Boolean {
        return remote.register(email, password)
    }
}
