package com.example.timurmuhortov.amocrm.util.retrofit

import com.google.gson.annotations.SerializedName

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 3:22
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


class NetworkError : Throwable {

    constructor() : super()

    constructor(message: String) : super() {
        this.message = message
    }

    @SerializedName("message")
    override var message: String? = ""
    @SerializedName("code")
    var code: Int = 0

}