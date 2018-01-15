package com.example.timurmuhortov.amocrm.ui.viewholder

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.example.timurmuhortov.amocrm.R
import com.example.timurmuhortov.amocrm.data.view.DealViewData

/**
 * @author: timur.mukhortov
 * date: 15.01.2018
 * time: 1:41
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/


class DealViewHolder (
        inflater: LayoutInflater,
        container: ViewGroup
): RecyclerView.ViewHolder(inflater.inflate(R.layout.item_deal, container, false)) {

    @BindView(R.id.text_deal_name)
    lateinit var textDealName: TextView

    @BindView(R.id.text_deal_date)
    lateinit var textDealDate: TextView

    @BindView(R.id.text_deal_budget)
    lateinit var textDealBudget: TextView

    init {
        ButterKnife.bind(this, itemView)
    }

    fun bind(data: DealViewData){
        textDealName.text = data.name
        textDealDate.text = data.date.toString()
        textDealBudget.text = data.budget
    }
}