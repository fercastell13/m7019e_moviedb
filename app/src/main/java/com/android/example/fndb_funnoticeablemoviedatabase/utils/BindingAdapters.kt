package com.android.example.fndb_funnoticeablemoviedatabase.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("posterImageUrl")
fun bindPosterImage(imgView: ImageView, imgUrl: String) {
    imgUrl.let {
        Glide
            .with(imgView)
            .load(
                Constants.POSTER_IMAGE_BASE_URL + Constants.POSTER_IMAGE_WIDTH + it
            )
            .into(imgView);
    }
}

@BindingAdapter("backdropImageUrl")
fun bindBackdropImage(imgView: ImageView, imgUrl: String) {
    imgUrl.let { backdropPath ->
        Glide
            .with(imgView)
            .load(
                Constants.BACKDROP_IMAGE_BASE_URL + Constants.BACKDROP_IMAGE_WIDTH + backdropPath
            )
            .into(imgView);
    }
}