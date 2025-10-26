package com.example.musicapp

import androidx.room.*
import kotlinx.coroutines.flow.Flow



@Dao
interface SongDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSong(song: Song)

    @Query("SELECT * FROM songs ORDER BY title ASC")
    fun getAllSongs(): Flow<List<Song>>

    @Delete
    suspend fun deleteSong(song:Song)


}