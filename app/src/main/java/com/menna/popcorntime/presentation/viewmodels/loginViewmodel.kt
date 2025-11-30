package com.example.popcorntime.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.popcorntime.domain.usecase.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
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
                val result = loginUseCase.login(email, password)
                if (loginUseCase.isUserLoggedIn()) {
                    onLogin()
                } else {
                    onError("login failed")
                }
            } catch (e: Exception) {
                onError(e.message ?: "Login failed")
            }
        }
    }
}