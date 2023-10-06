package com.hpwiki.navigation.bottomBar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.hpwiki.utils.AppGreen

@Composable
fun BottomBarNavigation(navController: NavController) {
    val items = listOf(
        BottomBarItems.Houses,
        BottomBarItems.Characteres,
        BottomBarItems.Staff,
        BottomBarItems.Spells
    )

    BottomNavigation(elevation = 10.dp, backgroundColor = Color.White, contentColor = Color.White) {
        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry.value?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(icon = {

                Image(
                    modifier = Modifier.size(20.dp),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = if (item.route != currentRoute) item.icon else item.selectedIcon),
                    contentDescription = stringResource(id = item.name)
                )
            },
                label = {
                    Text(
                        text = stringResource(id = item.name),
                        color = if (currentRoute != item.route) Color.Gray else AppGreen,
                        fontSize = 9.sp
                    )
                },
                selectedContentColor = Color.White,
                alwaysShowLabel = true,
                selected = false,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                })
        }
    }
}