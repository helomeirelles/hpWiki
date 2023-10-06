package com.hpwiki.navigation.bottomBar

import com.hpwiki.R
import com.hpwiki.navigation.HpNavigationScreens

sealed class  BottomBarItems(
    val route: String,
    val name: Int,
    val icon: Int,
    val selectedIcon: Int
) {
    object Houses: BottomBarItems(
        route = HpNavigationScreens.HousesScreen.name,
        name = R.string.houses,
        icon = R.drawable.ic_houses,
        selectedIcon = R.drawable.ic_selected_houses
    )

    object Characteres: BottomBarItems(
        route = HpNavigationScreens.CharactersScreen.name,
        name = R.string.houses,
        icon = R.drawable.ic_houses,
        selectedIcon = R.drawable.ic_selected_houses
    )

    object Staff: BottomBarItems(
        route = HpNavigationScreens.StaffScreen.name,
        name = R.string.houses,
        icon = R.drawable.ic_houses,
        selectedIcon = R.drawable.ic_selected_houses
    )

    object Spells: BottomBarItems(
        route = HpNavigationScreens.SpellsScreen.name,
        name = R.string.houses,
        icon = R.drawable.ic_houses,
        selectedIcon = R.drawable.ic_selected_houses
    )
}