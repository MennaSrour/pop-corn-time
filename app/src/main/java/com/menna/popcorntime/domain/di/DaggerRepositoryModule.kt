package com.popcorntime.movio.di


import com.popcorntime.domain.repository.AccountRepository
import com.popcorntime.domain.repository.ArtistsRepository
import com.popcorntime.domain.repository.GuestRepository
import com.popcorntime.domain.repository.LanguageRepository
import com.popcorntime.domain.repository.LoginRepository
import com.popcorntime.domain.repository.MoviesRepository
import com.popcorntime.domain.repository.OnboardingRepository
import com.popcorntime.domain.repository.SearchRecommendationRepository
import com.popcorntime.domain.repository.SearchRepository
import com.popcorntime.domain.repository.SeriesRepository
import com.popcorntime.domain.repository.ThemeRepository
import com.popcorntime.domain.repository.VersionRepository
import com.popcorntime.repository.account.AccountRepositoryImpl
import com.popcorntime.repository.artists.ArtistsRepositoryImpl
import com.popcorntime.repository.guest.GuestRepositoryImpl
import com.popcorntime.repository.language.LanguageRepositoryImpl
import com.popcorntime.repository.login.LoginRepositoryImpl
import com.popcorntime.repository.movie.MovieRepositoryImpl
import com.popcorntime.repository.onboarding.OnboardingRepositoryImpl
import com.popcorntime.repository.search.SearchRecommendationRepositoryImpl
import com.popcorntime.repository.search.SearchRepositoryImpl
import com.popcorntime.repository.series.SeriesRepositoryImpl
import com.popcorntime.repository.theme.ThemeRepositoryImpl
import com.popcorntime.repository.version.VersionRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindLoginRepository(
        impl: LoginRepositoryImpl
    ): LoginRepository

    @Binds
    @Singleton
    abstract fun bindSearchRepository(
        impl: SearchRepositoryImpl
    ): SearchRepository

    @Binds
    @Singleton
    abstract fun bindSearchRecommendationRepository(
        impl: SearchRecommendationRepositoryImpl
    ): SearchRecommendationRepository

    @Binds
    @Singleton
    abstract fun bindMoviesRepository(
        impl: MovieRepositoryImpl
    ): MoviesRepository

    @Binds
    @Singleton
    abstract fun bindSeriesRepository(
        impl: SeriesRepositoryImpl
    ): SeriesRepository

    @Binds
    @Singleton
    abstract fun bindArtistsRepository(
        impl: ArtistsRepositoryImpl
    ): ArtistsRepository

    @Binds
    @Singleton
    abstract fun bindOnboardingRepository(
        impl: OnboardingRepositoryImpl
    ): OnboardingRepository

    @Binds
    @Singleton
    abstract fun bindGuestRepository(
        impl: GuestRepositoryImpl
    ): GuestRepository

    @Binds
    @Singleton
    abstract fun bindAccountRepository(
        impl: AccountRepositoryImpl
    ): AccountRepository

    @Singleton
    @Binds
    abstract fun bindThemeRepository(impl: ThemeRepositoryImpl): ThemeRepository

    @Singleton
    @Binds
    abstract fun bindLanguageRepository(impl: LanguageRepositoryImpl): LanguageRepository

    @Binds
    @Singleton
    abstract fun bindVersionRepository(
        impl: VersionRepositoryImpl
    ): VersionRepository
}
