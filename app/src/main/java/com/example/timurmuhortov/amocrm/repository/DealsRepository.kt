package com.example.timurmuhortov.amocrm.repository

import com.example.timurmuhortov.amocrm.data.Deal
import com.example.timurmuhortov.amocrm.data.Embedded
import com.example.timurmuhortov.amocrm.data.Response
import com.example.timurmuhortov.amocrm.domain.irepository.IDealsRepository
import com.example.timurmuhortov.amocrm.domain.network.AmocrmAPI
import com.example.timurmuhortov.amocrm.util.retrofit.INetworkErrorMapper
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author: timur.mukhortov
 * date: 15.01.2018
 * time: 14:21
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


class DealsRepository constructor(
        private val retrofit: AmocrmAPI,
        private val networkErrorMapper: INetworkErrorMapper
) : IDealsRepository {

    override fun deals(): Single<Response<Deal>> =
            retrofit.deals("t.mukhortov@gmail.com", "IO6k77El", "31b5fec772537f93367884097b89239d", "json")
                    .subscribeOn(Schedulers.io())
                    .onErrorResumeNext { Single.error(networkErrorMapper.map(it)) }
                    .observeOn(AndroidSchedulers.mainThread())

}