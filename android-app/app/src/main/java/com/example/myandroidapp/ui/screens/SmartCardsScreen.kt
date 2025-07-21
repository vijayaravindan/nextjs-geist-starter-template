package com.example.myandroidapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SmartCardsScreen() {
    var isFlipped by remember { mutableStateOf(false) }
    val wordFront = "Ubiquitous"
    val wordBack = "Present, appearing, or found everywhere"

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "Smart Cards",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Card(
            modifier = Modifier.fillMaxWidth().height(300.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            onClick = { isFlipped = !isFlipped }
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = androidx.compose.ui.Alignment.Center) {
                Text(
                    text = if (isFlipped) wordBack else wordFront,
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = { /* Mark as Hard */ }) {
                Text("Hard")
            }
            Button(onClick = { /* Mark as Easy */ }) {
                Text("Easy")
            }
        }
    }
}
