package com.example.timurmuhortov.amocrm.data.login

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 2:57
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


data class UserData(
        val USER_LOGIN: String,
        val USER_PASSWORD: String,
        val USER_HASHUSER_HASH: String,
        val type: String
)