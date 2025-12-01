package com.example.popcorntime.domain.usecase

import com.example.popcorntime.domain.repository.AuthRepository

class RegisterUseCase(
    private val repository: AuthRepository
) {
    suspend fun execute(email: String, password: String): Boolean {
        return repository.register(email, password)
    }
}
