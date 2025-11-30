package com.popcorntime.domain.usecase

import com.popcorntime.domain.repository.VersionRepository
import javax.inject.Inject

class GetAppVersionUseCase @Inject constructor(
    private val repository: VersionRepository
) {
     fun getAppVersion(): String = repository.getAppVersion()
}