package com.hpwiki.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hpwiki.data.DataOrException
import com.hpwiki.features.houses.TestScreen
import com.hpwiki.models.Houses
import com.hpwiki.ui.screens.main.HousesScreenViewModel

@Composable
fun HpNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = HpNavigationScreens.HousesScreen.name) {

        //where all the screens should be hosted
        composable(route = HpNavigationScreens.HousesScreen.name) {

            TestScreen()
        }
    }
}