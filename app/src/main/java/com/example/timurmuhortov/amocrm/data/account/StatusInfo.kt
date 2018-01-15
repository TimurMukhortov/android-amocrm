package com.example.timurmuhortov.amocrm.data.account

import com.google.gson.annotations.SerializedName

/**
 * @author: timur.mukhortov
 * date: 16.01.2018
 * time: 1:27
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


data class StatusInfo(
        @SerializedName("id")
        val id: Int,
        @SerializedName("name")
        val name: String,
        @SerializedName("color")
        val color: String
)