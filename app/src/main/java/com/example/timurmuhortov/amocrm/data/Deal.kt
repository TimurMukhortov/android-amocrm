package com.example.timurmuhortov.amocrm.data

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 4:13
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


data class Deal(

        @SerializedName("id")
        val id: String,
        @SerializedName("name")
        val name: String
)