package com.example.myandroidapp.ui.navigation

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myandroidapp.ui.components.BottomNavigationBar
import com.example.myandroidapp.ui.screens.*

@Composable
fun VocabMasterApp() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = androidx.compose.ui.Modifier.padding(innerPadding)
        ) {
            composable("home") { HomeScreen() }
            composable("smart_cards") { SmartCardsScreen() }
            composable("story_mode") { StoryModeScreen() }
            composable("memory_palace") { MemoryPalaceScreen() }
            composable("profile") { ProfileScreen() }
            composable("settings") { SettingsScreen() }
        }
    }
}
