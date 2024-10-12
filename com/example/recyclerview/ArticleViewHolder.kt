package com.example.recyclerview
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val image1:ImageView=itemView.findViewById(R.id.image1)
    val text1:TextView=itemView.findViewById(R.id.text1)
}