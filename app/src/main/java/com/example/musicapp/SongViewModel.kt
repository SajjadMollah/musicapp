package com.example.musicapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn


class SongViewModel(private val repository: SongRepository): ViewModel(){

    val songList: StateFlow<List<Song>> = repository.getAllSongs()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )
    //TODO:fun loadAllSongs() {
    //        // ViewModel logic to trigger data loading from the repository
    //        // If repository.getAllSongs() returns a Flow, this might not be strictly needed,
    //        // but it shows where you'd handle user actions.
    //    }

}