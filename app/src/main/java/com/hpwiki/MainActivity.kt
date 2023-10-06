package com.hpwiki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.hpwiki.navigation.HpNavigation
import com.hpwiki.navigation.bottomBar.BottomBarNavigation
import com.hpwiki.ui.theme.HpWikiTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HpWikiTheme {
                val navController = rememberNavController()
                // A surface container using the 'background' color from the theme
                Scaffold(bottomBar = {BottomBarNavigation(navController = navController)},
                content = { padding ->
                    Box(modifier = Modifier.padding(padding)){
                        HpNavigation(navController)
                    }
                })

            }
        }
    }
}