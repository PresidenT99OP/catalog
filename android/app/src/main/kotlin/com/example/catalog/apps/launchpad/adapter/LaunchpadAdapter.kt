package com.vynksafe.app.ui.home.apps.launchpad.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.vynksafe.app.R
import com.vynksafe.app.databinding.LaunchpadLayoutItemBinding
import com.vynksafe.app.models.Launchpad
import com.vynksafe.app.util.VynkDiffUtil

class LaunchpadAdapter() : RecyclerView.Adapter<LaunchpadAdapter.MyViewHolder>() {

    var dataList = emptyList<Launchpad>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.launchpad_layout_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = dataList[position]
        LaunchpadLayoutItemBinding.bind(holder.itemView).apply {
            txtTitle.text = data.title
            imgLogo.setImageResource(data.image)
            txtDescription.text = data.description
            txtTokenOffered.text = data.tokenOffered.toString() + " BAR"
            txtSalePrice.text = "1 BAR = " + data.salePrice.toString() + "BNB"
            txtParticipants.text = data.participants.toString()
            txtTotalCommitment.text = data.totalCommitted.toString() + "BNR"
            txtEndTime.text = data.endTime
        }
    }

    override fun getItemCount(): Int = dataList.size

    fun setData(newList: List<Launchpad>) {
        val diffUtil =
            VynkDiffUtil(dataList, newList)
        val diffUtilResult = DiffUtil.calculateDiff(diffUtil)
        dataList = newList
        diffUtilResult.dispatchUpdatesTo(this)
    }
}
