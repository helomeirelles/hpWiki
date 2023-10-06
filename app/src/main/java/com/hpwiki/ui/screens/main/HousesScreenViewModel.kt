package com.hpwiki.ui.screens.main

import androidx.lifecycle.ViewModel
import com.hpwiki.data.DataOrException
import com.hpwiki.models.CharacterItem
import com.hpwiki.models.Houses
import com.hpwiki.repository.HousesRepository
import com.hpwiki.repository.HpRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class HousesScreenViewModel @Inject constructor(private val housesRepository: HousesRepository) : ViewModel() {

    suspend fun getHouses(): DataOrException<Houses, Boolean, Exception> {
        return housesRepository.getHouses()
    }
}