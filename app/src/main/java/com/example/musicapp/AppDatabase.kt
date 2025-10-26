package com.example.musicapp

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Room


@Database(entities = [Song::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun songDao(): SongDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "music_database").build()
                INSTANCE = instance
                instance
            }

        }
    }
}
