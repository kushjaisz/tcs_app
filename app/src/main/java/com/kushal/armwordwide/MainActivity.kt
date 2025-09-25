package com.kushal.armwordwide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kushal.armwordwide.ui.components.CustomBottomBar
import com.kushal.armwordwide.ui.components.HomeLayoutPreview
import com.kushal.armwordwide.ui.screen.ArtistDirectoryScreen
import com.kushal.armwordwide.ui.screen.MenuScreen
import com.kushal.armwordwide.ui.screen.MovieScreen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                {
                    val navController = rememberNavController()

                    Scaffold(
                        bottomBar = { CustomBottomBar(navController) } // pass navController
                    ) { innerPadding ->
                        NavHost(
                            navController = navController,
                            startDestination = "home",
                            modifier = Modifier.padding(innerPadding)
                        ) {
                            composable("home") { HomeLayoutPreview() }
                            composable("movie") { MovieScreen() }
                            composable("artist") { ArtistDirectoryScreen() }
                            composable("menu") { MenuScreen() }
                        }
                    }
            }
        }
    }
}










