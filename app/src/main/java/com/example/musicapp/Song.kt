package com.example.musicapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "songs")
class Song(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val artist: String,
    val filePath: String,
    )