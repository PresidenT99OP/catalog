package com.vynksafe.app.ui.home.apps.staking.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.vynksafe.app.R
import com.vynksafe.app.databinding.StakingLayoutItemBinding
import com.vynksafe.app.models.Staking
import com.vynksafe.app.util.VynkDiffUtil

class StakingAdapter : RecyclerView.Adapter<StakingAdapter.MyViewHolder>() {

    private var stakingList = emptyList<Staking>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.staking_layout_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = stakingList[position]
        StakingLayoutItemBinding.bind(holder.itemView).apply {
            txtTitle.text = item.title
            imgLogo.setImageResource(item.image)
            txtNoOfTrades.text = "${item.noOfTrades}"
            txtTradePercent.text = "${item.tradePercent}%"
            txtInterestRate.text = "${item.interest}%"
            txtMinLockAmount.text = "${item.amount}%"
        }
    }

    override fun getItemCount(): Int = stakingList.size

    fun setData(newList: List<Staking>) {
        val diffUtil =
            VynkDiffUtil(stakingList, newList)
        val diffUtilResult = DiffUtil.calculateDiff(diffUtil)
        stakingList = newList
        diffUtilResult.dispatchUpdatesTo(this)
    }
}
