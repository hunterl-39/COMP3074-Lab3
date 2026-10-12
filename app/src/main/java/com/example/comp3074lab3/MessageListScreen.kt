package com.example.comp3074lab3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.comp3074lab3.ui.theme.Comp3074Lab3Theme

@Composable
fun MessageListScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFCE4EC)) // soft pink background matching screenshot
    ) {
        items(sampleMessages, key = { it.id }) { message ->
            MessageItem(message = message)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MessageListScreenPreview() {
    Comp3074Lab3Theme {
        MessageListScreen()
    }
}
