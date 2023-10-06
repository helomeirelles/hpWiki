package com.hpwiki.di

import com.hpwiki.constants.AppConstants.BASE_URL
import com.hpwiki.constants.AppConstants.HOUSES_BASE_URL
import com.hpwiki.network.HousesApiImp
import com.hpwiki.network.HpApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideHpApi(): HpApiImpl {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(HpApiImpl::class.java)
    }

    @Provides
    @Singleton
    fun provideHousesApi(): HousesApiImp {
        return Retrofit.Builder()
            .baseUrl(HOUSES_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(HousesApiImp::class.java)
    }
}