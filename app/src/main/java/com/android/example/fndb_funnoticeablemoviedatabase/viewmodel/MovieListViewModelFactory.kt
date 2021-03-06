package com.android.example.fndb_funnoticeablemoviedatabase.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MovieListViewModelFactory(private val application: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MovieListViewModel::class.java)) {
            return MovieListViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }

}