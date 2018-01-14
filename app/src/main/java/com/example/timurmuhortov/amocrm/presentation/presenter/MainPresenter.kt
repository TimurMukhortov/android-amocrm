package com.example.timurmuhortov.amocrm.presentation.presenter

import android.util.Log
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.timurmuhortov.amocrm.data.Deal
import com.example.timurmuhortov.amocrm.data.UserData
import com.example.timurmuhortov.amocrm.di.scope.FragmentScope
import com.example.timurmuhortov.amocrm.domain.irepository.IAuthRepository
import com.example.timurmuhortov.amocrm.presentation.view.IMainView
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

    private var saveDeals: MutableList<Deal> = mutableListOf()

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        authRepository.login(
                UserData("t.mukhortov@gmail.com",
                        "IO6k77El",
                        "31b5fec772537f93367884097b89239d",
                        "json"))
                .subscribe({
                    authRepository.deals()
                            .subscribe({ deals ->
                                saveDeals.addAll(deals)
                            }, {
                                Log.i("Main", it.message)
                            })
                }, {
                    Log.i("Main", it.message)
                })

    }


}