package com.example.musicapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideSongRespository(songDao: SongDao): SongRepository {
        return SongRepository(songDao)
    }

    @Singleton
    @Provides
    fun provideSongDao(db)
}