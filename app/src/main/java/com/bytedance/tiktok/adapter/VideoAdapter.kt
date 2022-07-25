package com.bytedance.tiktok.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bytedance.tiktok.R
import com.bytedance.tiktok.adapter.VideoAdapter.VideoViewHolder
import com.bytedance.tiktok.base.BaseRvAdapter
import com.bytedance.tiktok.base.BaseRvViewHolder
import com.bytedance.tiktok.bean.VideoBean
import com.bytedance.tiktok.view.ControllerView
import com.bytedance.tiktok.view.LikeView

/**
 * create by libo
 * create on 2020-05-20
 * description
 */
class VideoAdapter(context: Context, datas: MutableList<VideoBean>) : BaseRvAdapter<VideoBean, VideoViewHolder>(context, datas) {
    override fun onBindData(holder: VideoViewHolder, data: VideoBean, position: Int) {
        holder.controllerView!!.setVideoData(data)
        holder.ivCover!!.setImageResource(data.coverRes)
        holder.likeView!!.setOnClickListener {
            if (!data.isLiked) {  //未点赞，会有点赞效果，否则无
                holder.controllerView!!.like()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_video, parent, false)
        return VideoViewHolder(view)
    }

    class VideoViewHolder(itemView: View?) : BaseRvViewHolder(itemView) {
        var likeView = itemView?.findViewById<LikeView>(R.id.likeview)
        var controllerView = itemView?.findViewById<ControllerView>(R.id.controller)
        var ivCover = itemView?.findViewById<ImageView>(R.id.iv_cover)
    }
}