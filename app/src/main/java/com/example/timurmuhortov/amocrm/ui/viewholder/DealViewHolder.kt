package com.example.timurmuhortov.amocrm.ui.viewholder

import android.support.v4.content.ContextCompat
import android.support.v7.widget.CardView
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

    @BindView(R.id.cardView_deal)
    lateinit var cardViewDeal: CardView

    init {
        ButterKnife.bind(this, itemView)
    }

    fun bind(data: DealViewData){
        textDealName.text = data.name
        textDealDate.text = data.date.toString()
        textDealBudget.text = data.budget
        //Метод для проставления бэкграунда у CardView в зависимсти от статуса сделки
        //setBackGround(data.statusColor)
    }

    private fun setBackGround( hexColor: String ){

        when(hexColor){
            "#CCFF66" -> cardViewDeal.background = ContextCompat.getDrawable(itemView.context, R.color.colorStatusSuccessfullyImplemented)
            "#D5D8DB" -> cardViewDeal.background = ContextCompat.getDrawable(itemView.context, R.color.colorStatusClosedAndNotImplemented)
            "#99ccff" -> cardViewDeal.background = ContextCompat.getDrawable(itemView.context, R.color.colorStatusFirstContact)
            "#ffff99" -> cardViewDeal.background = ContextCompat.getDrawable(itemView.context, R.color.colorStatusConversation)
            "#ffcc66" -> cardViewDeal.background = ContextCompat.getDrawable(itemView.context, R.color.colorMakeDecision)
            "#ffcccc" -> cardViewDeal.background = ContextCompat.getDrawable(itemView.context, R.color.colorHarmonizationContract)

        }
    }
}