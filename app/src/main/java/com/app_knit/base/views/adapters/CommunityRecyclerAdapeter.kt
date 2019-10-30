package com.app_knit.base.views.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app_knit.base.R
import com.app_knit.base.repository.models.PostCommunity
import com.app_knit.base.utils.ScreenDimensions
import kotlinx.android.synthetic.main.row_community_cardlist.view.*
import kotlinx.android.synthetic.main.row_region_cardlist.view.*

class CommunityRecyclerAdapeter(mContext: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<PostCommunity> = ArrayList()
    var itemSize = 0

    init {
        itemSize = ((ScreenDimensions(mContext).getScreenWidth() - (3 * mContext.resources.getDimension(R.dimen.activity_horizontal_margin))) / 2).toInt()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return viewholder(LayoutInflater.from(parent.context).inflate(R.layout.row_community_cardlist, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is viewholder -> {
                holder.bind1(items.get(position))
            }
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(lists: List<PostCommunity>) {
        items = lists
        notifyDataSetChanged()
    }

    inner class viewholder constructor(itemView: View):RecyclerView.ViewHolder(itemView){

        init {
            itemView.card.layoutParams.width = itemSize
//            itemView.card5.layoutParams.height = itemSize
        }
        val name = itemView.txtTVcommunity
        fun bind1(postCommunity: PostCommunity){
            name.setText(postCommunity.text1)
        }
    }

}