package com.popcorntime.domain.repository

import com.popcorntime.entity.Artist

interface ArtistsRepository {
    suspend fun getArtistsByQuery(query: String,page:Int): List<Artist>

    suspend fun getArtistById(id: Long): Artist

    suspend fun getSeriesTopCast(seriesId: Long, page: Int): List<Artist>

    suspend fun getMovieTopCast(movieId: Long, page: Int): List<Artist>
}