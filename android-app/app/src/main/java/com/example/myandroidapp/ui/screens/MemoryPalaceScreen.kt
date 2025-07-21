package com.example.myandroidapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MemoryPalaceScreen() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Text(
            text = "Memory Palace",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "Visual learning technique to associate words with memorable locations.",
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Tap words in the room to collect and memorize them effectively.",
            style = MaterialTheme.typography.bodyLarge
        )
        // Placeholder for 3D room view or interactive UI
        Spacer(modifier = Modifier.height(200.dp))
    }
}
