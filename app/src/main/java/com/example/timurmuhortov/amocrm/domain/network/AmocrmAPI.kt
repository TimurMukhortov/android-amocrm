package com.example.timurmuhortov.amocrm.domain.network

import com.example.timurmuhortov.amocrm.data.Deal
import com.example.timurmuhortov.amocrm.data.Response
import com.example.timurmuhortov.amocrm.data.settings.UserData
import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

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

    /**
     *
     * Get list of deals
     */
    @GET("api/v2/leads")
    fun deals(
            @Query("USER_LOGIN") name: String,
            @Query("USER_PASSWORD") password: String,
            @Query("USER_HASHUSER_HASH") hash: String,
            @Query("type") type: String): Single<Response<Deal>>

//    не успел распарсить ответ от сервера
//    здесь можно получить список статусов в каждой воронке
//    https://new5a57e0b6d71e1.amocrm.ru/api/v2/account?with=pipelines
//    @GET(api/v2/account)
//    fun deals(
//            @Query("USER_LOGIN") name: String,
//            @Query("USER_PASSWORD") password: String,
//            @Query("USER_HASHUSER_HASH") hash: String,
//            @Query("type") type: String,
//            @Query (with"): ответ от сервера
}