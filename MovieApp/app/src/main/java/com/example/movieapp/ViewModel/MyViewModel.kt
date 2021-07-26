package com.example.movieapp.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.movieapp.Model.Image
import com.example.movieapp.Model.ModelData
import com.example.movieapp.Remote.Resource
import com.example.movieapp.repository.MyRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import okhttp3.Dispatcher


class MyViewModel(val repository: MyRepository): ViewModel() {

    fun getMoviesName(movies:String):LiveData<List<ModelData>> {
return liveData (Dispatchers.IO){
   val result=repository.getMoviesName(movies)
    result.data?.let {
        emit(it) }
}
    }

}