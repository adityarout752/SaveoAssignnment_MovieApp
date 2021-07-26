package com.example.movieapp.repository

import com.example.movieapp.Model.Image
import com.example.movieapp.Model.ModelData
import com.example.movieapp.Remote.ApiService
import com.example.movieapp.Remote.Resource
import com.example.movieapp.Remote.ResponseHandler
import com.example.movieapp.Remote.RetrofitGenerator
import retrofit2.Response


class MyRepository {
    val api:ApiService= RetrofitGenerator.getInstance()
        .create(ApiService::class.java)
    val responseHandler= ResponseHandler()
    suspend fun getMoviesName(movies:String): Resource<List<ModelData>>{
val result=api.getMoviesName(movies)
        return responseHandler.handleSuccess(result)
    }
}