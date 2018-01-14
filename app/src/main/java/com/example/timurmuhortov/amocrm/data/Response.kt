package com.example.timurmuhortov.amocrm.data

import com.google.gson.annotations.SerializedName

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 21:49
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


data class Response<out T>(
        @SerializedName("_embedded")
        val embedded: Embedded<T>
)