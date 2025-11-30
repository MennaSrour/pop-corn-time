package com.popcorntime.domain.usecase

import com.popcorntime.domain.repository.ThemeRepository
import com.popcorntime.entity.Theme
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class ThemeManagerUseCase @Inject constructor(
    private val repository: ThemeRepository
) {
    fun getTheme(): Flow<Theme> {
        return repository.getTheme()
    }

    suspend fun saveTheme(theme: Theme) {
        repository.saveTheme(theme)
    }
}