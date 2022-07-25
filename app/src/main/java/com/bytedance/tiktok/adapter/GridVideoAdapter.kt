package com.bytedance.tiktok.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bytedance.tiktok.R
import com.bytedance.tiktok.activity.PlayListActivity
import com.bytedance.tiktok.adapter.GridVideoAdapter.GridVideoViewHolder
import com.bytedance.tiktok.base.BaseRvAdapter
import com.bytedance.tiktok.base.BaseRvViewHolder
import com.bytedance.tiktok.bean.VideoBean
import com.bytedance.tiktok.view.IconFontTextView

/**
 * create by libo
 * create on 2020-05-20
 * description
 */
class GridVideoAdapter(context: Context, datas: List<VideoBean>) : BaseRvAdapter<VideoBean, GridVideoViewHolder>(context, datas) {
    override fun onBindData(holder: GridVideoViewHolder, data: VideoBean, position: Int) {
        holder.ivCover?.setBackgroundResource(data.coverRes)
        holder.tvContent?.text = data.content
        holder.tvDistance?.text = "${data.distance} km"
        holder.ivHead?.setImageResource(data.userBean!!.head)
        holder.itemView.setOnClickListener {
            PlayListActivity.initPos = position
            context.startActivity(Intent(context, PlayListActivity::class.java))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridVideoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_gridvideo, parent, false)
        return GridVideoViewHolder(view)
    }

    class GridVideoViewHolder(itemView: View?) : BaseRvViewHolder(itemView) {
        var ivCover = itemView?.findViewById<ImageView>(R.id.iv_cover)
        var tvContent = itemView?.findViewById<TextView>(R.id.tv_content)
        var tvDistance = itemView?.findViewById<IconFontTextView>(R.id.tv_distance)
        var ivHead = itemView?.findViewById<ImageView>(R.id.iv_head)
    }
}