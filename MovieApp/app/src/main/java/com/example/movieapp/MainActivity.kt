package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.movieapp.Adapter.VerticalAdapter
import com.example.movieapp.Model.ModelData
import com.example.movieapp.Remote.Resource
import com.example.movieapp.ViewModel.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MyViewModel
    private lateinit var adapter2: VerticalAdapter
    val imagelist= mutableListOf<ModelData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(myToolbar)
        setupViewModel()
        setupUI()
        setupObservers()
    }

    private fun setupViewModel() {
      viewModel= ViewModelProviders.of(this).get(MyViewModel::class.java)

    }

    private fun setupUI() {
        adapter2= VerticalAdapter(imagelist as ArrayList<ModelData>)
       verticalRecyclerview.layoutManager=GridLayoutManager(this,3)
        verticalRecyclerview.adapter=adapter2

    }

    private fun setupObservers() {
        viewModel.getMoviesName("god").observe(this, Observer {

    })
}

}
