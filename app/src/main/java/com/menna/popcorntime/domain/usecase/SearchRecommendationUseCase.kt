package com.popcorntime.domain.usecase

import com.popcorntime.domain.repository.SearchRecommendationRepository
import javax.inject.Inject

class GetSearchRecommendationUseCase @Inject constructor(
    private val searchRecommendationRepository: SearchRecommendationRepository
) {
    suspend operator fun invoke(query: String): List<String> {
        return searchRecommendationRepository.getSearchRecommendation(query)
    }
}
