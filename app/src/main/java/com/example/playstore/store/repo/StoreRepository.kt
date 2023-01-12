package com.example.playstore.store.repo

import com.example.playstore.store.data.dataSource.storeDataSource
import com.example.playstore.store.data.model.StoreResponse
import com.example.playstore.store.data.model.StoreRequest
import javax.inject.Inject

class StoreRepository @Inject constructor(private val dataSource: storeDataSource) {
    suspend fun getStoreData(
        requestBody: StoreRequest
    ): Result<StoreResponse> =
        dataSource.getStoreData(requestBody)

}