package com.example.timurmuhortov.amocrm.di.module

import com.example.timurmuhortov.amocrm.domain.network.AmocrmAPI
import com.example.timurmuhortov.amocrm.repository.AuthRepository
import com.example.timurmuhortov.amocrm.util.retrofit.INetworkErrorMapper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author: timur.mukhortov
 * date: 12.01.2018
 * time: 2:16
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideAuthRepository(retrofit: AmocrmAPI, errorMapper: INetworkErrorMapper) = AuthRepository(retrofit, errorMapper)

}