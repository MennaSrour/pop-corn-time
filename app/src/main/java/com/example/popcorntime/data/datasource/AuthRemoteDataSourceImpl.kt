package com.example.popcorntime.data.datasource

import kotlinx.coroutines.delay

class AuthRemoteDataSourceImpl : AuthDataSource {
    override suspend fun login(email: String, password: String): Boolean {
        // Temporary: simulate remote call
        delay(200)
        return email.isNotBlank() && password.isNotBlank()
    }

    override suspend fun register(email: String, password: String): Boolean {
        // Temporary: simulate remote register
        delay(250)
        return email.isNotBlank() && password.length >= 6
    }
}
