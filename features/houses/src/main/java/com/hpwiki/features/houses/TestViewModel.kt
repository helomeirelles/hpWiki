package com.hpwiki.features.houses

import androidx.lifecycle.ViewModel
import com.hpwiki.data.DataOrException
import com.hpwiki.models.Houses
import com.hpwiki.repository.HousesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(private val housesRepository: HousesRepository) : ViewModel() {

    suspend fun getHouses(): DataOrException<Houses, Boolean, Exception> {
        return housesRepository.getHouses()
    }
}