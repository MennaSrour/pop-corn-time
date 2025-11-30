package com.popcorntime.domain.usecase

import com.popcorntime.domain.repository.ArtistsRepository
import com.popcorntime.domain.repository.MoviesRepository
import com.popcorntime.domain.repository.SearchRepository
import com.popcorntime.domain.repository.SeriesRepository
import com.popcorntime.entity.Artist
import com.popcorntime.entity.Movie
import com.popcorntime.entity.Series
import javax.inject.Inject

class ManageArtistUseCase @Inject constructor(
    private val artistsRepository: ArtistsRepository,
    private val searchRepository: SearchRepository,
    private val moviesRepository: MoviesRepository,
    private val seriesRepository: SeriesRepository
) {
    suspend fun getArtistsByQuery(query: String, page: Int ): List<Artist> {
        return artistsRepository.getArtistsByQuery(query,page).also {
            searchRepository.addQuery(query)
        }
    }

    suspend fun getArtistById(id: Long): Artist {
        return artistsRepository.getArtistById(id)
    }

    suspend fun getMoviesOfArtist(artistId: Long): List<Movie> {
        return moviesRepository.getMoviesOfArtist(artistId)
    }

    suspend fun getSeriesOfArtist(artistId: Long): List<Series> {
        return seriesRepository.getSeriesOfArtist(artistId)
    }
}