package com.example.timurmuhortov.amocrm.util.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.timurmuhortov.amocrm.data.view.DealViewData
import com.example.timurmuhortov.amocrm.di.scope.FragmentScope
import com.example.timurmuhortov.amocrm.ui.viewholder.DealViewHolder
import javax.inject.Inject

/**
 * @author: timur.mukhortov
 * date: 15.01.2018
 * time: 3:38
 * @LinkedIn: linkedin.com/in/timurmukhortov
 **/

@FragmentScope
class DealAdapter @Inject constructor() : RecyclerView.Adapter<DealViewHolder>() {

    var deals: List<DealViewData>? = null
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onBindViewHolder(holder: DealViewHolder, position: Int) {
        deals?.get(position)?.let {
            holder.bind(it)
        }
    }

    override fun getItemCount() = deals?.size ?: 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            DealViewHolder(LayoutInflater.from(parent.context), parent)



}