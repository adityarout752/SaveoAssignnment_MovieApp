package com.example.movieapp.Adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideBuilder
import com.example.movieapp.Model.ModelData
import com.example.movieapp.R
import kotlinx.coroutines.withContext
import java.util.ArrayList
import kotlin.coroutines.coroutineContext


class VerticalAdapter( var imagelist:ArrayList<ModelData>):
    RecyclerView.Adapter<VerticalAdapter.VerticalViewholder>() {


    class VerticalViewholder(val itemview: View):RecyclerView.ViewHolder(itemview){

        val imageView: ImageView =
            itemview.findViewById<ImageView>(R.id.iv_verticalRecycler)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewholder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.vertical_item_layout, parent, false)

        return VerticalViewholder(view)
    }

    override fun onBindViewHolder(holder: VerticalViewholder, position: Int) {
var url=imagelist.get(position).show.image.original

            Glide.with(holder.imageView).load(url).into(holder.imageView)


    }

    override fun getItemCount(): Int {
        return imagelist.size
    }
fun addImage(imagelist: ArrayList<ModelData>){
    this.imagelist.apply {
        clear()
        addAll(imagelist)
    }
}

}