package com.example.movieapp.Model


import com.google.gson.annotations.SerializedName

data class Externals(
    @SerializedName("imdb")
    var imdb: String,
    @SerializedName("thetvdb")
    var thetvdb: Int,
    @SerializedName("tvrage")
    var tvrage: Int
)