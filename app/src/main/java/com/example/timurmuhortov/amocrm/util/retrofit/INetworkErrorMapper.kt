package com.example.timurmuhortov.amocrm.util.retrofit

import okhttp3.ResponseBody

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 3:23
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


interface INetworkErrorMapper {

    fun map(throwable: Throwable): NetworkError
    fun map(body: ResponseBody?): NetworkError

}