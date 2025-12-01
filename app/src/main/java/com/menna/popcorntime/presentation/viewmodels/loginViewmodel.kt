package com.example.popcorntime.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.popcorntime.domain.usecase.LoginUseCase
import kotlinx.coroutines.launch

class LoginViewModel(
    private val loginUseCase: LoginUseCase
) : ViewModel() {

    fun login(
        email: String,
        password: String,
        onLogin: () -> Unit = {},
        onError: (String) -> Unit = {}
    ) {
        viewModelScope.launch {
            try {
                val result = loginUseCase.execute(email, password)
                if (result || loginUseCase.isUserLoggedIn()) {
                    onLogin()
                } else {
                    onError("Please provide valid credentials")
                }
            } catch (e: Exception) {
                onError(e.message ?: "Login failed")
            }
        }
    }
}