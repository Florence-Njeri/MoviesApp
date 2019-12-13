package com.example.moviesapp.ui.drama

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.moviesapp.R
import com.example.moviesapp.ui.comedy.DramaViewModel

class DramaFragment : Fragment() {

    private lateinit var dramaViewModel: DramaViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dramaViewModel =
            ViewModelProviders.of(this).get(DramaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_drama, container, false)
        val textView: TextView = root.findViewById(R.id.text_drama)
        dramaViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}