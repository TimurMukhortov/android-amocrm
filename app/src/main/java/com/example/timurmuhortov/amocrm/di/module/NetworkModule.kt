package com.example.timurmuhortov.amocrm.di.module

import com.example.timurmuhortov.amocrm.domain.network.AmocrmAPI
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * @author: timur.mukhortov
 * date: 14.01.2018
 * time: 2:34
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun provideGson() = GsonBuilder().create()

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient.Builder()
            .readTimeout(120, TimeUnit.SECONDS)
            .build()


    @Provides
    @Singleton
    fun provideRetrofit(gson: Gson, client: OkHttpClient) = Retrofit.Builder()
            .baseUrl("https://new5a57e0b6d71e1.amocrm.ru/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(client)
            .build()

    @Provides
    @Singleton
    fun provideElpassApi(retrofit: Retrofit) = retrofit.create(AmocrmAPI::class.java)
}