package com.example.color

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.color.databinding.FragmentAboutBinding

class About : Fragment() {
    //private lateinit var binding: ViewDataBinding
    private lateinit var view: View
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //val bind : ViewDataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_about,container,false)
        //binding = DataBindingUtil.inflate(inflater,R.layout.fragment_about,container,false)
        //return inflater.inflate(R.layout.fragment_about, container, false)
        //return binding.root
        view = inflater.inflate(R.layout.fragment_about, container, false)
        return view
    }
}