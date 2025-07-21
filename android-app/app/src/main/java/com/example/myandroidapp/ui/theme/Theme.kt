package com.example.myandroidapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = 0xFF6200EE.toInt(),
    secondary = 0xFF03DAC6.toInt(),
    background = 0xFFFFFFFF.toInt(),
    surface = 0xFFFFFFFF.toInt(),
    onPrimary = 0xFFFFFFFF.toInt(),
    onSecondary = 0xFF000000.toInt(),
    onBackground = 0xFF000000.toInt(),
    onSurface = 0xFF000000.toInt(),
)

private val DarkColors = darkColorScheme(
    primary = 0xFFBB86FC.toInt(),
    secondary = 0xFF03DAC6.toInt(),
    background = 0xFF121212.toInt(),
    surface = 0xFF121212.toInt(),
    onPrimary = 0xFF000000.toInt(),
    onSecondary = 0xFF000000.toInt(),
    onBackground = 0xFFFFFFFF.toInt(),
    onSurface = 0xFFFFFFFF.toInt(),
)

@Composable
fun MyAndroidAppTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}
