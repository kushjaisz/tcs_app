package com.kushal.armwordwide.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = YellowPrimary,
    onPrimary = Color.Black,
    background = Dark14,
    onBackground = LightGrayD9,
    surface = Dark29,
    onSurface = White,
    secondary = RedAccent,
    onSecondary = White,
    tertiary = Dark73,
    onTertiary = LightGrayD9,
)


@Composable
fun ARMWordWideTheme(
    content: @Composable () -> Unit
) {
    val colorScheme = DarkColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

