package com.example.movieapp.Remote

import com.example.movieapp.Model.Image
import com.example.movieapp.Model.ModelData
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("/shows")
suspend fun getMoviesName(@Query("movies")
                              movies:String):List<ModelData>
}