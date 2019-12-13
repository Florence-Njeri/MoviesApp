package com.example.moviesapp.ui.comedy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.moviesapp.R

class ComedyFragment : Fragment() {

    private lateinit var comedyViewModel: ComedyViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        comedyViewModel =
            ViewModelProviders.of(this).get(ComedyViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_comedy, container, false)
        val textView: TextView = root.findViewById(R.id.text_comedy)
        comedyViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}