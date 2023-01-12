package com.example.playstore.store.data.dataSource

import com.example.playstore.base.data.dataSource.BaseDataSource
import com.example.playstore.store.data.api.StoreApiService
import com.example.playstore.store.data.model.StoreResponse
import com.example.playstore.store.data.model.StoreRequest
import com.google.gson.Gson


interface StoreDataSource {
    suspend fun getStoreData(requestBody: StoreRequest): Result<StoreResponse>
}
class storeDataSource(gson: Gson,
                      private val api: StoreApiService
) : BaseDataSource(gson), StoreDataSource {

    override suspend fun getStoreData(requestBody: StoreRequest): Result<StoreResponse> {
        return safeApiRequest { api.getStore(requestBody) }
    }
}