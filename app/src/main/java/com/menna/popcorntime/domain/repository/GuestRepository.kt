package com.popcorntime.domain.repository

interface GuestRepository {
    suspend fun setGuestState(enteredAsGuest: Boolean)
    suspend fun getGuestState(): Boolean
}