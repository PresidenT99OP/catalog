package com.parrychat.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.parrychat.android.data.model.Host
import com.parrychat.android.databinding.HomeItemLayoutBinding
import com.parrychat.android.util.CarryDiffUtil

class HomeAdapter(val onButtonClick: (String) -> Unit) : RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {

    var hostList = emptyList<Host>()

    inner class MyViewHolder(itemView: HomeItemLayoutBinding) : RecyclerView.ViewHolder(itemView.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = HomeItemLayoutBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val host = hostList[position]
        HomeItemLayoutBinding.bind(holder.itemView).apply {
            txtAge.text = host.age.toString()
            txtName.text = host.name
            txtCountry.text = host.country
            txtDescription.text = host.status
            //  Show photo here
            holder.itemView.setOnClickListener {
                onButtonClick("Clicked")
            }
        }
    }

    override fun getItemCount(): Int {
        return hostList.size
    }

    fun setData(newList: List<Host>) {
        val hostDiffUtil = CarryDiffUtil(hostList, newList)
        val diffUtilResult = DiffUtil.calculateDiff(hostDiffUtil)
        hostList = newList
        diffUtilResult.dispatchUpdatesTo(this)
    }
}
