package com.app_knit.base.views.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app_knit.base.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.codingwithmitch.kotlinrecyclerviewexample.models.BlogPost
import kotlinx.android.synthetic.main.row_blog_list_item.view.*


class BlogRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<BlogPost> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.row_blog_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    when(holder){
        is BlogViewHolder ->{
            holder.bind(items.get(position))
        }
    }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    fun submitList(blogList: List<BlogPost>){
        items = blogList
        notifyDataSetChanged()
    }

    class BlogViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val blog_image = itemView.image
        val blog_title = itemView.txtTitle
        val blog_auther = itemView.subTitle
        fun bind(blogPost: BlogPost) {
            blog_title.setText(blogPost.title)
            blog_auther.setText(blogPost.username)
                val  requestOptions = RequestOptions()
                    .placeholder(R.drawable.ic_group_avatar)
                    .error(R.drawable.ic_group_avatar)
                    Glide.with(itemView.context)
                        .applyDefaultRequestOptions(requestOptions)
                        .load(blogPost.image)
                        .into(blog_image)
        }

    }


}