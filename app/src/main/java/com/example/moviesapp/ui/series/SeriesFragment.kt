package com.example.moviesapp.ui.series

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.R
import com.example.moviesapp.ui.comedy.SeriesViewModel

class SeriesFragment : Fragment() {

    private lateinit var seriesViewModel: SeriesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        seriesViewModel =
            ViewModelProviders.of(this).get(SeriesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_series, container, false)
        val textView: TextView = root.findViewById(R.id.text_series)
        seriesViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}