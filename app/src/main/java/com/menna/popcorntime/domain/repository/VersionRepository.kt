package com.popcorntime.domain.repository

interface VersionRepository {
    fun getAppVersion(): String
}