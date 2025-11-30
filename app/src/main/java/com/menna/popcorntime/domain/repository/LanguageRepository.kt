package com.popcorntime.domain.repository

import com.popcorntime.entity.Language
import kotlinx.coroutines.flow.Flow

interface LanguageRepository {
    fun getLanguageFlow(): Flow<Language>
    suspend fun getLanguage(): String
    suspend fun saveLanguage(language: Language)
}