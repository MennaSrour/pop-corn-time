package com.example.popcorntime.domain.usecase

import com.example.popcorntime.domain.repository.AuthRepository

class LoginUseCase(
    private val repository: AuthRepository
) {
    suspend fun execute(email: String, password: String): Boolean {
        return repository.login(email, password)
    }

    fun isUserLoggedIn(): Boolean {
        // Temporary placeholder
        return false
    }
}
