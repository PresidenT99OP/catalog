package com.vynksafe.app.ui.home.apps.lending.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.vynksafe.app.R
import com.vynksafe.app.databinding.LendingLayoutItemBinding
import com.vynksafe.app.models.Lending
import com.vynksafe.app.util.VynkDiffUtil

class LendingAdapter : RecyclerView.Adapter<LendingAdapter.MyViewHolder>() {

    private var lendingList = emptyList<Lending>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.lending_layout_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = lendingList[position]
        LendingLayoutItemBinding.bind(holder.itemView).apply {
            txtTitle.text = item.title
            imgLogo.setImageResource(item.image)
            txtAmount.text = "${item.amount}"
            txtInterestPA.text = "${item.interest}%"
        }
    }

    override fun getItemCount(): Int = lendingList.size

    fun setData(newList: List<Lending>) {
        val diffUtil =
            VynkDiffUtil(lendingList, newList)
        val diffUtilResult = DiffUtil.calculateDiff(diffUtil)
        lendingList = newList
        diffUtilResult.dispatchUpdatesTo(this)
    }
}
