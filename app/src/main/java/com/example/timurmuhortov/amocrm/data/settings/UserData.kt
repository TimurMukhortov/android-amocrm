package com.example.timurmuhortov.amocrm.data.settings

import com.google.gson.annotations.SerializedName

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 2:57
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


data class UserData(
        @SerializedName("USER_LOGIN")
        val login: String,
        @SerializedName("USER_PASSWORD")
        val password: String,
        @SerializedName("USER_HASHUSER_HASH")
        val hash: String,
        val type: String
)