package com.hpwiki.repository

import com.hpwiki.data.DataOrException
import com.hpwiki.models.CharacterItem
import com.hpwiki.network.HpApiImpl
import javax.inject.Inject

class HpRepository @Inject constructor (private val api: HpApiImpl) {
    suspend fun getCharacters(): DataOrException<com.hpwiki.models.Character, Boolean, Exception> {
        val response = try {
            api.getCharacters()

        } catch (e: Exception){
            return DataOrException(e = e)

        }
        return DataOrException(data = response)
    }

    suspend fun getCharactersById(id: String): DataOrException<CharacterItem, Boolean, Exception> {
        val response = try {
            api.getCharactersById(id = id)

        } catch (e: Exception){
            return DataOrException(e = e)

        }
        return DataOrException(data = response)
    }
}