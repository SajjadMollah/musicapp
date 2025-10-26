package com.example.musicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


class MainActivity: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            YourAppTheme{
                Surface{
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                }

                }
            }

        }
    })
}