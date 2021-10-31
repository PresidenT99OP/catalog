package com.vynksafe.app.ui.home.apps.savings.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.vynksafe.app.R
import com.vynksafe.app.databinding.SavingLayoutItemBinding
import com.vynksafe.app.models.Savings
import com.vynksafe.app.util.VynkDiffUtil

class SavingAdapter : RecyclerView.Adapter<SavingAdapter.MyViewHolder>() {

    private var dataList = emptyList<Savings>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.saving_layout_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = dataList[position]
        SavingLayoutItemBinding.bind(holder.itemView).apply {
            txtTitle.text = data.title
            imgLogo.setImageResource(data.image)
            txtEstmtAnnualYield.text = "${data.annualYield}%"
            txtYesterdayInterest.text = "${data.interest}%"
        }
    }

    override fun getItemCount(): Int = dataList.size

    fun setData(newList: List<Savings>) {
        val diffUtil =
            VynkDiffUtil(dataList, newList)
        val diffUtilResult = DiffUtil.calculateDiff(diffUtil)
        dataList = newList
        diffUtilResult.dispatchUpdatesTo(this)
    }
}
