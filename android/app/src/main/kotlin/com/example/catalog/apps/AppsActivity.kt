package com.vynksafe.app.ui.home.apps

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.vynksafe.app.R
import com.vynksafe.app.databinding.ActivityAppsBinding
import com.vynksafe.app.models.Lending
import com.vynksafe.app.ui.home.apps.borrow.BorrowFragment
import com.vynksafe.app.ui.home.apps.farming.FarmingFragment
import com.vynksafe.app.ui.home.apps.launchpad.LaunchpadFragment
import com.vynksafe.app.ui.home.apps.lending.LendingFragment
import com.vynksafe.app.ui.home.apps.orders.OrdersFragment
import com.vynksafe.app.ui.home.apps.savings.SavingsFragment
import com.vynksafe.app.ui.home.apps.staking.StakingFragment
import com.vynksafe.app.ui.home.apps.swap.SwapFragment

private const val NUM_PAGES = 8

class AppsActivity : AppCompatActivity() {

    private var _binding: ActivityAppsBinding? = null
    private val binding get() = _binding!!
    private lateinit var firstTab: TabLayout.Tab
    private lateinit var previousTab: TabLayout.Tab

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityAppsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val pagerAdapter = FragmentAdapter(
            this@AppsActivity
        )
        binding.vpApps.adapter = pagerAdapter
//        binding.vpApps.scroll

        TabLayoutMediator(binding.tabLayoutApps, binding.vpApps) { tab, position ->
            when (position) {
                0 -> {
                    tab.setCustomView(R.layout.apps_custom_tab_item)
                    tab.customView?.findViewById<ImageView>(R.id.tabIcon)
                        ?.setImageResource(R.drawable.ic_savings)
                    tab.customView?.findViewById<TextView>(R.id.tabTitle)?.text = "Savings"
                    firstTab = tab
                    enableTab(firstTab)
                    previousTab = firstTab
                }
                1 -> {
                    tab.setCustomView(R.layout.apps_custom_tab_item)
                    tab.customView?.findViewById<ImageView>(R.id.tabIcon)
                        ?.setImageResource(R.drawable.ic_staking)
                    tab.customView?.findViewById<TextView>(R.id.tabTitle)?.text = "Staking"
                }
                2 -> {
                    tab.setCustomView(R.layout.apps_custom_tab_item)
                    tab.customView?.findViewById<ImageView>(R.id.tabIcon)
                        ?.setImageResource(R.drawable.ic_farming)
                    tab.customView?.findViewById<TextView>(R.id.tabTitle)?.text = "Farming"
                }
                3 -> {
                    tab.setCustomView(R.layout.apps_custom_tab_item)
                    tab.customView?.findViewById<ImageView>(R.id.tabIcon)
                        ?.setImageResource(R.drawable.ic_swap)
                    tab.customView?.findViewById<TextView>(R.id.tabTitle)?.text = "Swap"
                }
                4 -> {
                    tab.setCustomView(R.layout.apps_custom_tab_item)
                    tab.customView?.findViewById<ImageView>(R.id.tabIcon)
                        ?.setImageResource(R.drawable.ic_launchpad)
                    tab.customView?.findViewById<TextView>(R.id.tabTitle)?.text = "Launchpad"
                }
                5 -> {
                    tab.setCustomView(R.layout.apps_custom_tab_item)
                    tab.customView?.findViewById<ImageView>(R.id.tabIcon)
                        ?.setImageResource(R.drawable.ic_lending)
                    tab.customView?.findViewById<TextView>(R.id.tabTitle)?.text = "Lending"
                }
                6 -> {
                    tab.setCustomView(R.layout.apps_custom_tab_item)
                    tab.customView?.findViewById<ImageView>(R.id.tabIcon)
                        ?.setImageResource(R.drawable.ic_borrow)
                    tab.customView?.findViewById<TextView>(R.id.tabTitle)?.text = "Borrow"
                }
                7 -> {
                    tab.setCustomView(R.layout.apps_custom_tab_item)
                    tab.customView?.findViewById<ImageView>(R.id.tabIcon)
                        ?.setImageResource(R.drawable.ic_shopping_cart)
                    tab.customView?.findViewById<TextView>(R.id.tabTitle)?.text = "Orders"
                }
            }
        }.attach()

        binding.tabLayoutApps.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    enableTab(tab)
                    disableTab()
                    previousTab = tab
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }

    private fun enableTab(currentTab: TabLayout.Tab) {
        currentTab.customView?.findViewById<ImageView>(R.id.tabIcon)
            ?.setBackgroundResource(R.drawable.circle_bg)
        currentTab.customView?.findViewById<ImageView>(R.id.tabIndicator)?.visibility = View.VISIBLE
    }

    private fun disableTab() {
        previousTab.customView?.findViewById<ImageView>(R.id.tabIcon)
            ?.setBackgroundResource(R.drawable.diable_circle_bg)
        previousTab.customView?.findViewById<ImageView>(R.id.tabIndicator)?.visibility = View.GONE
    }

//    private fun changeBackground(item: RelativeLayout?) {
//        item?.setBackgroundResource(R.drawable.circle_bg)
//    }

    override fun onBackPressed() {
//        if (binding.vpApps.currentItem == 0) {
//            // If the user is currently looking at the first step, allow the system to handle the
//            // Back button. This calls finish() on this activity and pops the back stack.
//            super.onBackPressed()
//        } else {
//            // Otherwise, select the previous step.
//            binding.vpApps.currentItem = binding.vpApps.currentItem - 1
//        }
        super.onBackPressed()
    }
}

class FragmentAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SavingsFragment()
            1 -> StakingFragment()
            2 -> FarmingFragment()
            3 -> SwapFragment()
            4 -> LaunchpadFragment()
            5 -> LendingFragment()
            6 -> BorrowFragment()
            7 -> OrdersFragment()
            else -> SavingsFragment()
        }
    }
}
