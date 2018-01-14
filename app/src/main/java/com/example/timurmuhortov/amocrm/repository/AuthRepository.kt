package com.example.timurmuhortov.amocrm.repository

import com.example.timurmuhortov.amocrm.data.Deal
import com.example.timurmuhortov.amocrm.data.UserData
import com.example.timurmuhortov.amocrm.domain.irepository.IAuthRepository
import com.example.timurmuhortov.amocrm.domain.network.AmocrmAPI
import com.example.timurmuhortov.amocrm.util.retrofit.INetworkErrorMapper
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
        private val retrofit: AmocrmAPI,
        private val networkErrorMapper: INetworkErrorMapper
): IAuthRepository {

    override fun deals(): Single<List<Deal>> =
        retrofit.deals()
                .subscribeOn(Schedulers.io())
                .onErrorResumeNext { Single.error(networkErrorMapper.map(it)) }
                .observeOn(AndroidSchedulers.mainThread())


    override fun login(userData: UserData): Single<ResponseBody> =
        retrofit.auth(userData)
                .subscribeOn(Schedulers.io())
                .onErrorResumeNext { Single.error(networkErrorMapper.map(it)) }
                .observeOn(AndroidSchedulers.mainThread())

}