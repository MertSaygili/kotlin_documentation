package com.example.kotlindocumentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(R.drawable.image, R.drawable.image2, R.drawable.image3)
        val viewPagerAdapter = ViewPagerAdapter(images)

        viewPager.adapter = viewPagerAdapter
        TabLayoutMediator(tabLayout, viewPager) {tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()

        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Tab is selected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Tab is unselected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }
            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "Tab is reselected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
