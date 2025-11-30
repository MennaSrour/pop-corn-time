package com.popcorntime.domain.usecase

import com.popcorntime.domain.repository.LanguageRepository
import com.popcorntime.entity.Language
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LanguageManagerUseCase @Inject constructor(
    private val repository: LanguageRepository
) {

    fun getLanguage(): Flow<Language> {
        return repository.getLanguageFlow()
    }

    suspend fun saveLanguage(language: Language) {
        repository.saveLanguage(language)
    }
}