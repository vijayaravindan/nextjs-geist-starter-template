package com.example.myandroidapp.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

data class NavItem(val name: String, val route: String)

val navItems = listOf(
    NavItem("Home", "home"),
    NavItem("Smart Cards", "smart_cards"),
    NavItem("Story Mode", "story_mode"),
    NavItem("Memory Palace", "memory_palace"),
    NavItem("Profile", "profile"),
    NavItem("Settings", "settings")
)

@Composable
fun BottomNavigationBar(navController: NavController) {
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ) {
        navItems.forEach { item ->
            Text(
                text = item.name,
                style = if (currentRoute == item.route)
                    MaterialTheme.typography.bodyLarge
                else
                    MaterialTheme.typography.bodyMedium,
                color = if (currentRoute == item.route)
                    MaterialTheme.colorScheme.primary
                else
                    MaterialTheme.colorScheme.onBackground,
                modifier = Modifier
                    .weight(1f)
                    .clickable {
                        navController.navigate(item.route) {
                            launchSingleTop = true
                        }
                    }
            )
        }
    }
}
