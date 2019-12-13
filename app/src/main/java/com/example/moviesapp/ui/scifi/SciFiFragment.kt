package com.example.moviesapp.ui.scifi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.moviesapp.R

class SciFiFragment : Fragment() {

    private lateinit var sciFiViewModel: SciFiViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sciFiViewModel =
            ViewModelProviders.of(this).get(SciFiViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_scifi, container, false)
        val textView: TextView = root.findViewById(R.id.text_scifi)
        sciFiViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}