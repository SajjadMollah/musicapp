package com.example.musicapp

class SongRepository(private val songDao: SongDao){
    fun getAllSongs() = songDao.getAllSongs()

    suspend fun insertSong(song: Song){
        songDao.insertSong(song)
    }
    //TODO: suspend fun fetchAndCacheNewSongs() {
    //        // 1. Fetch from NetworkService
    //        // 2. Map Network objects to Room Entities
    //        // 3. songDao.insertAll(newEntities)
    //    }




}