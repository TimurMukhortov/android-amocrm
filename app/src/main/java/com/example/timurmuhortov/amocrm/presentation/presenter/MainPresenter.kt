package com.example.timurmuhortov.amocrm.presentation.presenter

import android.util.Log
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.timurmuhortov.amocrm.data.Deal
import com.example.timurmuhortov.amocrm.data.Response
import com.example.timurmuhortov.amocrm.data.UserData
import com.example.timurmuhortov.amocrm.data.view.DealViewData
import com.example.timurmuhortov.amocrm.di.scope.FragmentScope
import com.example.timurmuhortov.amocrm.domain.irepository.IAuthRepository
import com.example.timurmuhortov.amocrm.presentation.view.IMainView
import net.danlew.android.joda.DateUtils
import org.joda.time.DateTime
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

/**
 * @author: timur.mukhortov
 * date: 12.01.2018
 * time: 3:13
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/

@FragmentScope
@InjectViewState
class MainPresenter @Inject constructor(
        private val authRepository: IAuthRepository
) : MvpPresenter<IMainView>() {

    private var saveDeals: Response<Deal>? = null

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        getAuth()
    }

    fun getAuth() {
        authRepository.login(
                UserData("t.mukhortov@gmail.com",
                        "IO6k77El",
                        "31b5fec772537f93367884097b89239d",
                        "json"))
                .subscribe({
                    Log.i("Main", "Авторизация прошла успешно.")
                    getDeal()
                }, {
                    Log.i("Main", "Проблема с авторизацией: " + it.message)
                })
    }

    private fun getDeal() {
        authRepository.deals()
                .subscribe(
                        { deals ->
                            saveDeals = deals
                            viewState.showDeals(
                                    deals.embedded.items.map {
                                        DealViewData(
                                                it.name,
                                                convertTimeStampToDate(it.date),
                                                it.budget
                                        )
                                    }
                            )
                            Log.i("Main", "Список сделок получен.")
                        }, {
                    Log.i("Main", "Проблема с получением списка сделок: " + it.message)
                })
    }

    private fun convertTimeStampToDate(timestamp: String): String? {
        val simpleDateFormat = SimpleDateFormat("dd-MM-yyyy")
        val netDate = DateTime((timestamp.toLong()) * 1000L)
        val myDate = Date(netDate.millis)
        val testDate = simpleDateFormat.format(myDate)
        return testDate
    }
}