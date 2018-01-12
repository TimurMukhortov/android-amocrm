package com.example.timurmuhortov.amocrm.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import butterknife.Unbinder
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.timurmuhortov.amocrm.R
import com.example.timurmuhortov.amocrm.presentation.presenter.MainPresenter
import com.example.timurmuhortov.amocrm.presentation.view.IMainView
import com.example.timurmuhortov.amocrm.ui.base.BaseFragment
import javax.inject.Inject

/**
 * @author: timur.mukhortov
 * date: 12.01.2018
 * time: 3:06
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


class MainFragment : BaseFragment(), IMainView {

    companion object {
        fun newInstance() = MainFragment
    }

    @Inject
    @InjectPresenter
    lateinit var presenter: MainPresenter

    @ProvidePresenter
    fun providePresenter() = presenter

    private lateinit var unbinder: Unbinder

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.activity_main, container, false).also {
                unbinder = ButterKnife.bind(this@MainFragment, it)
            }

    override fun onDestroyView() {
        super.onDestroyView()
        unbinder.unbind()
    }
}