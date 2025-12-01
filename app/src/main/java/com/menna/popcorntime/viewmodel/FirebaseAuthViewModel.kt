package com.example.popcorntime.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.popcorntime.domain.usecase.RegisterUseCase
import kotlinx.coroutines.launch

class FirebaseAuthViewModel(
    private val registerUseCase: RegisterUseCase
) : ViewModel() {

    fun register(
        email: String,
        password: String,
        onRegister: () -> Unit = {},
        onError: (String) -> Unit = {}
    ) {
        viewModelScope.launch {
            try {
                val result = registerUseCase.execute(email, password)
                if (result) {
                    onRegister()
                } else if (password.length < 6) {
                    onError("Password must be at least 6 characters")
                } else {
                    onError("Please provide valid details")
                }
            } catch (e: Exception) {
                onError(e.message ?: "Registration failed")
            }
        }
    }
}
