package com.example.moviesapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.R

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    //TODO: Add a list from the data class
//    val moviesData= listOf<>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.movie_item, parent, false)
        return MoviesViewHolder(view)
    }

    override fun getItemCount() = 12
    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.bind()

    }

    class MoviesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var movieImage: ImageView = view.findViewById(R.id.movieImage)
        var movieTitle: TextView = view.findViewById(R.id.movieTitle)
        var releaseYear: TextView = view.findViewById(R.id.releaseYear)
        var ratingBar: RatingBar = view.findViewById(R.id.ratingBar)

        fun bind() {
            movieImage.setImageResource(R.drawable.aquaman)
            movieTitle.text = "Aquaman"
            releaseYear.text = "2018"
            ratingBar.numStars= 5
        }
    }
}