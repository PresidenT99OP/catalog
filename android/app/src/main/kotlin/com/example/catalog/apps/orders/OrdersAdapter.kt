package com.vynksafe.app.ui.home.apps.orders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.vynksafe.app.R
import com.vynksafe.app.databinding.LendingLayoutItemBinding
import com.vynksafe.app.databinding.OrdersLayoutItemBinding
import com.vynksafe.app.models.Lending
import com.vynksafe.app.models.Order
import com.vynksafe.app.util.VynkDiffUtil

class OrdersAdapter : RecyclerView.Adapter<OrdersAdapter.MyViewHolder>() {

    private var dataList = emptyList<Order>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.orders_layout_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = dataList[position]
        OrdersLayoutItemBinding.bind(holder.itemView).apply {
            txtTitle.text = item.title
            txtType.text = item.type
            txtDate.text = item.date
            txtTime.text = item.time
            txtPrice.text = item.price.toString()
            txtAverage.text = item.average.toString()
            txtAmount.text = item.amount.toString()
            txtFilled.text = item.filled.toString()
        }
    }

    override fun getItemCount(): Int = dataList.size

    fun setData(newList: List<Order>) {
        val diffUtil =
            VynkDiffUtil(dataList, newList)
        val diffUtilResult = DiffUtil.calculateDiff(diffUtil)
        dataList = newList
        diffUtilResult.dispatchUpdatesTo(this)
    }
}
