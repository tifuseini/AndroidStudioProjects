package com.ispace.bootcamp

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2
import com.ispace.bootcamp.slideShow.SlideShowSlides.slideShowAdapter

class IntroActivity :  AppCompatActivity(){

    private lateinit var slideShowViewPager:ViewPager2
    private lateinit var btnNext :Button

    private lateinit var textSkipIntro :TextView
    private lateinit var indicatorsContainer : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        slideShowViewPager = findViewById(R.id.slideShowViewPager)
        btnNext = findViewById(R.id.btnNext)
        textSkipIntro = findViewById(R.id.textSkipIntro)
        indicatorsContainer = findViewById(R.id.indicatorsContainer)


        setupIndicators()
        setCurrentIndicators(0)

        slideShowViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicators(position)
            }
            
        })

        btnNext.setOnClickListener {
            if (slideShowViewPager.currentItem + 1 < slideShowAdapter.itemCount) {
                slideShowViewPager.currentItem +=1
            }else{
                Intent(applicationContext, MainActivity::class.java).also {
                    startActivity(it)
                }
            }
        }



    }

    private fun setupIndicators() {
        val indicators = arrayOfNulls<ImageView>(slideShowAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams =
            LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )

        layoutParams.setMargins(8, 0, 8, 0)
        for (i in indicators.indices) {
            indicators[i] = ImageView(applicationContext)
            indicators[i].apply {
                this?.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive
                    )
                )
                this?.layoutParams = layoutParams
            }
            indicatorsContainer.addView(indicators[i])

        }
    }

    private fun setCurrentIndicators(index : Int) {
        val childCount = indicatorsContainer.childCount
        for (i in 0 until childCount) {
            val imageView =
                indicatorsContainer[i] as ImageView
            if (i == index) {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_active
                    )
                )
            } else {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive
                    )
                )
            }
        }
    }
}