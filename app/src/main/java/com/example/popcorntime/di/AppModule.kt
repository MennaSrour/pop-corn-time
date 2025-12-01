package com.example.popcorntime.di

import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel
import com.example.popcorntime.presentation.viewmodel.LoginViewModel
import com.example.popcorntime.presentation.viewmodel.FirebaseAuthViewModel
import com.example.popcorntime.data.datasource.AuthDataSource
import com.example.popcorntime.data.datasource.AuthRemoteDataSourceImpl
import com.example.popcorntime.data.repository.AuthRepositoryImpl
import com.example.popcorntime.domain.repository.AuthRepository
import com.example.popcorntime.domain.usecase.LoginUseCase
import com.example.popcorntime.domain.usecase.RegisterUseCase

val appModule = module {
    // Data sources
    single<AuthDataSource> { AuthRemoteDataSourceImpl() }

    // Repositories
    single<AuthRepository> { AuthRepositoryImpl(get()) }

    // UseCases
    single { LoginUseCase(get()) }
    single { RegisterUseCase(get()) }

    // ViewModels
    viewModel { LoginViewModel(get()) }
    viewModel { FirebaseAuthViewModel(get()) }
}
