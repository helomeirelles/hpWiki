package com.hpwiki.network

import com.hpwiki.models.Houses
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface HousesApiImp {
    @GET(value = "hpData.json")
    suspend fun getHouses(): Houses
}