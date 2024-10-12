package com.example.recyclerview

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ArticlesAdapter(private val articles: List<Article>) : RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        Log.d("testing", "onCreateViewHolder: View holder created")
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_article, parent, false)
        return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        Log.d("testing", "onBindViewHolder: Binding item# $position")
        val article = articles[position]  // Use the [] operator
        holder.text1.text = article.title
        holder.image1.setImageResource(article.image)
        holder.itemView.setOnClickListener ({
            val intent = Intent(holder.itemView.context,ArticleDetailsActivity::class.java).apply {
                putExtra("title", article.title)
                putExtra("image", article.image)
                putExtra("date", article.date)
                putExtra("details", article.details)

                }
                holder.itemView.context.startActivity(intent) } )// Use context directly
            }
        }

