package com.popcorntime.domain.repository

interface OnboardingRepository {
    suspend fun setOnboardingStateAsCompleted()
    suspend fun getOnboardingState(): Boolean
}