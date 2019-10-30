package com.app_knit.base.views.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app_knit.base.R
import com.app_knit.base.repository.models.PostCommunity
import com.app_knit.base.repository.models.PostSocialVerse
import kotlinx.android.synthetic.main.row_socialverselist.view.*

class SocialVerseRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<PostSocialVerse> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return dataholder(
                LayoutInflater.from(parent.context).inflate(R.layout.row_socialverselist, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is dataholder ->{
                holder.bind(items.get(position))
            }
        }
    }
    override fun getItemCount(): Int {
        return items.size
    }
    fun submitList(lists: List<PostSocialVerse>) {
        items = lists
        notifyDataSetChanged()
    }
    class dataholder  constructor(itemView:View) : RecyclerView.ViewHolder(itemView){
        val name = itemView.txTVTitle
        fun bind(postSocialVerse: PostSocialVerse){
            name.setText(postSocialVerse.txt)
        }

    }
}