package com.hpwiki.ui.screens.main

import android.util.Log
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.navigation.NavHostController
import com.hpwiki.data.DataOrException
import com.hpwiki.models.Houses

@Composable
fun HousesScreen(navController: NavHostController, housesViewModel: HousesScreenViewModel) {
    val hpData = produceState<DataOrException<Houses, Boolean, Exception>>(
        initialValue = DataOrException(loading = true)
    ) {
        value = housesViewModel.getHouses()
    }.value

    Text(text = "Houses Screen")
    Log.d("mytag", "data: ${hpData?.data?.get(0)?.House}")
}