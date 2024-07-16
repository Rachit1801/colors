package com.example.color

import android.app.Activity
import android.database.DatabaseUtils
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
//import androidx.databinding.DataBindingComponent
import com.example.color.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding
    private lateinit var bind : ActivityMainBinding
    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bind = DataBindingUtil.setContentView(this,R.layout.activity_main)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        //val bind = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)


        bind.apply {
            val clickViews: List<View> =
                listOf(textViewTop, textView1, textView2, textView3, textViewLeft, main)
            for (item in clickViews) {
                item.setOnClickListener {
                    colorIt(item)
                }
            }
        }
    }

    private fun goFragment(fragment: Fragment) {
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
    }

    private fun colorIt(view : View) {

        when(view) {
            bind.textViewTop -> goFragment(About())
            bind.textView1 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            bind.textView2 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            bind.textView3 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            bind.textViewLeft -> view.setBackgroundResource(android.R.color.holo_green_dark)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }

    }
}