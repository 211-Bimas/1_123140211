package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Halo, Muhammad Bimastiar!",
                style = MaterialTheme.typography.headlineMedium
            )

            Text(
                text = "NIM: 123140211",
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = "Running on: ${getPlatform().name}",
                color = Color.Gray
            )
        }
    }
}
