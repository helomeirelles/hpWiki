package com.hpwiki.network

import com.hpwiki.models.CharacterItem
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton


    @Singleton
    interface HpApiImpl {
        @GET(value = "characters")
        suspend fun getCharacters(): com.hpwiki.models.Character

        @GET(value = "characters/{id}")
        suspend fun getCharactersById(
            @Query("id") id: String,
        ): CharacterItem
    }
