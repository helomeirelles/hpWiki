package com.hpwiki.repository

import com.hpwiki.data.DataOrException
import com.hpwiki.models.Character
import com.hpwiki.models.Houses
import com.hpwiki.network.HousesApiImp
import com.hpwiki.network.HpApiImpl
import javax.inject.Inject

class HousesRepository @Inject constructor (private val api: HousesApiImp) {
    suspend fun getHouses(): DataOrException<Houses, Boolean, Exception> {
        val response = try {
            api.getHouses()

        } catch (e: Exception){
            return DataOrException(e = e)

        }
        return DataOrException(data = response)
    }
}