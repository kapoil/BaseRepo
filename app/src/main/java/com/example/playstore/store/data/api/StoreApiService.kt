package com.example.playstore.store.data.api

import com.example.playstore.base.data.model.BaseApiResponse
import com.example.playstore.store.data.model.StoreRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface StoreApiService {

    @POST("")
    suspend fun getStore(@Body requestObject: StoreRequest): BaseApiResponse

}