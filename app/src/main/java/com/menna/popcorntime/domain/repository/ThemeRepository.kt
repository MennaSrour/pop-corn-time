package com.popcorntime.domain.repository

import com.popcorntime.entity.Theme
import kotlinx.coroutines.flow.Flow

interface ThemeRepository {
    fun getTheme(): Flow<Theme>
    suspend fun saveTheme(theme: Theme)
}