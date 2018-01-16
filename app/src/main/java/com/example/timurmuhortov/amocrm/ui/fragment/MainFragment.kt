package com.example.timurmuhortov.amocrm.ui.fragment

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.timurmuhortov.amocrm.R
import com.example.timurmuhortov.amocrm.data.view.DealViewData
import com.example.timurmuhortov.amocrm.presentation.presenter.MainPresenter
import com.example.timurmuhortov.amocrm.presentation.view.IMainView
import com.example.timurmuhortov.amocrm.ui.base.BaseFragment
import com.example.timurmuhortov.amocrm.util.adapter.DealAdapter
import javax.inject.Inject

/**
 * @author: timur.mukhortov
 * date: 12.01.2018
 * time: 3:06
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


class MainFragment : BaseFragment(), IMainView {

    companion object {
        fun newInstance() = MainFragment()
    }

    @Inject
    @InjectPresenter
    lateinit var presenter: MainPresenter

    @Inject
    protected lateinit var adapterDeals: DealAdapter

    @ProvidePresenter
    fun providePresenter() = presenter

    @BindView(R.id.recyclerView_deals)
    lateinit var recyclerViewDocuments: RecyclerView

    private lateinit var unbinder: Unbinder

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_deals, container, false).also {
                unbinder = ButterKnife.bind(this@MainFragment, it)

                recyclerViewDocuments.layoutManager = LinearLayoutManager(context)
                recyclerViewDocuments.adapter = adapterDeals
            }

    override fun onDestroyView() {
        super.onDestroyView()
        unbinder.unbind()
    }

    override fun showDeals(deals: List<DealViewData>) {
        adapterDeals.deals = deals
    }

    override fun showError(msg: String){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}