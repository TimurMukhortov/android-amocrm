package com.example.timurmuhortov.amocrm.repository

import com.example.timurmuhortov.amocrm.data.login.UserData
import com.example.timurmuhortov.amocrm.domain.irepository.IAuthRepository
import com.example.timurmuhortov.amocrm.domain.network.AmocrmAPI
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.ResponseBody
import javax.inject.Inject

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 1:43
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


class AuthRepository @Inject constructor(
        private val retrofit: AmocrmAPI

): IAuthRepository {

    override fun login(userData: UserData): Single<ResponseBody> =
        retrofit.auth(userData)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())

}