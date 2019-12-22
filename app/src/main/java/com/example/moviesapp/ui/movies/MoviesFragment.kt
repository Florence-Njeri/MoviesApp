package com.example.moviesapp.ui.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.moviesapp.R
import com.example.moviesapp.adapter.MoviesAdapter
import com.example.moviesapp.databinding.FragmentMoviesBinding

class MoviesFragment : Fragment() {

    private lateinit var moviesViewModel: MoviesViewModel
    private lateinit var binding: FragmentMoviesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        moviesViewModel =
            ViewModelProviders.of(this).get(MoviesViewModel::class.java)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_movies, container, false)

        //RecyclerView to be added
        val adapter=MoviesAdapter()

        binding.moviesRecyclerView.adapter=adapter
        //TODO: Change from text to recyclerview
//        moviesViewModel.list.observe(viewLifecycleOwner, Observer {
//            it?.let {
////                adapter.data= it
//            }
//        }
        return binding.root
    }
}