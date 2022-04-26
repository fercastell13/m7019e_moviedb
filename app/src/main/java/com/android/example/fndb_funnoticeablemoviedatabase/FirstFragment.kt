package com.android.example.fndb_funnoticeablemoviedatabase

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.android.example.fndb_funnoticeablemoviedatabase.database.Movies
import com.android.example.fndb_funnoticeablemoviedatabase.databinding.FragmentFirstBinding
import com.android.example.fndb_funnoticeablemoviedatabase.utils.Constants
import com.bumptech.glide.Glide

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //  ?? 14-04-2021 RECORDING
        // _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        val movies = Movies()
        binding.movies = movies

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
/*
        var movies = Movies()

        val movieList = view.findViewById<LinearLayout>(R.id.movie_list_ll)
        val movieItem = movieList.findViewById<View>(R.id.movie_1)
        val movieTitle = movieItem.findViewById<TextView>(R.id.movie_title)
        val moviePoster = movieItem.findViewById<ImageView>(R.id.movie_poster)

        movieTitle.text = movies.list[0].title

        Glide
            .with(this)
            .load(Constants.POSTER_IMAGE_BASE_URL
                    + Constants.POSTER_IMAGE_WIDTH
                    + movies.list[0].posterPath)
            //.centerCrop()
                //NOT NOW
            //.placeholder(R.drawable.loading_spinner)
            //.error()
            .into(moviePoster);
*/
    }


    // useful?
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}