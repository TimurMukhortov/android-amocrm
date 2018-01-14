package com.example.timurmuhortov.amocrm.domain.irepository

import com.example.timurmuhortov.amocrm.data.login.UserData
import io.reactivex.Single
import okhttp3.ResponseBody

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 1:44
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


interface IAuthRepository {

    fun login(userData: UserData): Single<ResponseBody>
}