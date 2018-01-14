package com.example.timurmuhortov.amocrm.domain.network

import com.example.timurmuhortov.amocrm.data.login.UserData
import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 1:31
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


interface AmocrmAPI {

    /**
    *
    * User authorization
    *
    */
    @POST("private/api/auth.php")
    fun auth(@Body userData: UserData): Single<ResponseBody>
}