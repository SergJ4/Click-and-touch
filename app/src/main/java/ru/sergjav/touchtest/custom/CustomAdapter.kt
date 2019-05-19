package ru.sergjav.touchtest.custom

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import ru.sergjav.touchtest.R
import ru.sergjav.touchtest.makeClickable

class CustomAdapter : RecyclerView.Adapter<CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): CustomViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CustomViewHolder(inflater.inflate(R.layout.recycler_item_view, parent, false))
    }

    override fun getItemCount(): Int = 3

    override fun onBindViewHolder(viewHolder: CustomViewHolder, position: Int) {
        viewHolder.itemView.makeClickable("CustomViewHolder$position")
    }
}