package com.example.playstore.store.di

import com.example.playstore.store.data.api.StoreApiService
import com.example.playstore.store.data.dataSource.StoreDataSource
import com.example.playstore.store.data.dataSource.storeDataSource
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object StoreModule {

    @Singleton
    @Provides
    fun providesNxTournamentApiService(retrofit: Retrofit): StoreApiService {
        return retrofit.create(StoreApiService::class.java)
    }

    @Singleton
    @Provides
    fun providesNxTournamentDataSource(gson: Gson, apiService: StoreApiService): StoreDataSource {
        return storeDataSource(gson, apiService)
    }
}