package com.example.movieapp.Model


import com.google.gson.annotations.SerializedName

data class ModelData(
    @SerializedName("score")
    var score: Double,
    @SerializedName("show")
    var show: Show
)