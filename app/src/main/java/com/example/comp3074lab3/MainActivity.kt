package com.example.comp3074lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.comp3074lab3.ui.theme.Comp3074Lab3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Comp3074Lab3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFFCE4EC)
                ) {
                    MessageListScreen()
                }
            }
        }
    }
}
