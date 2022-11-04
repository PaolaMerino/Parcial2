package com.example.parcial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tlVistaTabla: TabLayout
    private lateinit var vpVistaPager: ViewPager2

    private val adaptador by lazy{
        vpAdaptador(this)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tlVistaTabla = findViewById(R.id.tl_VistaTablero)
        vpVistaPager = findViewById(R.id.vp_VistaPager)

        vpVistaPager.adapter = adaptador


        val mediadorTabla: TabLayoutMediator = TabLayoutMediator(tlVistaTabla,vpVistaPager,
            TabLayoutMediator.TabConfigurationStrategy{
                    tab, position ->
                when(position){
                    0->{

                        val badge: BadgeDrawable = tab.orCreateBadge
                        badge.backgroundColor = ContextCompat.getColor(applicationContext,R.color.micolor)
                        badge.isVisible = true

                    }
                    1->{

                        val badge: BadgeDrawable = tab.orCreateBadge
                        badge.backgroundColor = ContextCompat.getColor(applicationContext,R.color.micolor)
                        badge.number = 10
                        badge.isVisible = true
                    }
                    2->{


                        val badge: BadgeDrawable = tab.orCreateBadge
                        badge.backgroundColor = ContextCompat.getColor(applicationContext,R.color.micolor)

                    }

                }
            })
        mediadorTabla.attach()
    }
}