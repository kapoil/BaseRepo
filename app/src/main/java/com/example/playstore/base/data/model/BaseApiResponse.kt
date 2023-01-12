package com.example.playstore.base.data.model

import com.google.gson.JsonObject

class BaseApiResponse {

    var en: String? = null
    var response: JsonObject? = null

    override fun toString(): String {
        return "BaseApiResponse{" +
                "en='" + en + '\'' +
                ", response=" + response +
                '}'
    }
}