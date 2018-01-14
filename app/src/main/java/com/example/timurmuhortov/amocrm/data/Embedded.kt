package com.example.timurmuhortov.amocrm.data

import com.google.gson.annotations.SerializedName

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 21:50
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


data class Embedded<out T>(
        @SerializedName("items")
        val items: List<T>
)