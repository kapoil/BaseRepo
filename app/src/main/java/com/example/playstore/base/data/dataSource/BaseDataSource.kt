package com.example.playstore.base.data.dataSource

import com.example.playstore.base.data.model.BaseApiResponse
import com.example.playstore.base.data.model.BaseResponse
import com.google.gson.Gson
import com.google.gson.JsonParser

abstract class BaseDataSource
    (val gson: Gson){

    suspend inline fun <reified R : BaseResponse> safeApiRequest(
        crossinline action: suspend () -> BaseApiResponse
    ): Result<R> = Result.runCatching {
        val response = action()
        val jObj = JsonParser.parseString(response.response.toString()).asJsonObject
        val parsedResponse = gson.fromJson(jObj, R::class.java)
        if (parsedResponse.success) {
            parsedResponse
        } else {
            throw Exception(parsedResponse.error)
        }
    }
    }
