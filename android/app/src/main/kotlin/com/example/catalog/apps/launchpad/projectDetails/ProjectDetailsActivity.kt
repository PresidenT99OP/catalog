package com.vynksafe.app.ui.home.apps.launchpad.projectDetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vynksafe.app.databinding.ActivityProjectDetailsBinding

class ProjectDetailsActivity : AppCompatActivity() {

    private var _binding: ActivityProjectDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityProjectDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

//        val tags = listOf("Website", "Whitepaper", "View detailed Rules", "FAQ")
//        for (tag in tags) {
//            val chip = Chip(this)
//            chip.text = tag
// //            chip.setChipBackgroundColorResource(R.color.blue1)
// //            chip.setTextColor(resources.getColor(R.color.white))
//            chip.textSize = 10F
// //            chip.isChipIconVisible = false
//            chip.height = 36
//            chip.setChip
//            val padding = TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP, 10F,
//                resources.displayMetrics
//            ).toInt()
// //            chip.setPadding(padding,padding,padding,padding)
// //            chip.maxWidth = 30
//            chip.isCloseIconVisible = false
//            binding.cgTags.addView(chip)
//        }

        binding.cgTags
    }
}
