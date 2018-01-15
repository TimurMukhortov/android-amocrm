package com.example.timurmuhortov.amocrm.domain.irepository

import com.example.timurmuhortov.amocrm.data.Deal
import com.example.timurmuhortov.amocrm.data.Embedded
import com.example.timurmuhortov.amocrm.data.Response
import io.reactivex.Single

/**
 * @author: timur.mukhortov
 * date: 15.01.2018
 * time: 14:22
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


interface IDealsRepository {

    fun deals(): Single<Response<Deal>>

}