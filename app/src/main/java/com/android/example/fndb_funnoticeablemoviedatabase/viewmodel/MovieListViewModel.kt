package com.android.example.fndb_funnoticeablemoviedatabase.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.android.example.fndb_funnoticeablemoviedatabase.database.Movies
import com.android.example.fndb_funnoticeablemoviedatabase.model.Movie

class MovieListViewModel(application: Application) : AndroidViewModel(application) {
    private val _movieList = MutableLiveData<List<Movie>>()
    val movieList: LiveData<List<Movie>>
    get() {
        return _movieList
    }

    init {
        _movieList.postValue(Movies().list)
    }
}