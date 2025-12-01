package com.example.popcorntime.data.datasource

interface AuthDataSource {
    suspend fun login(email: String, password: String): Boolean
    suspend fun register(email: String, password: String): Boolean
}
