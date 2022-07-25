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
import com.bytedance.tiktok.adapter.WorkAdapter.WorkViewHolder
import com.bytedance.tiktok.base.BaseRvAdapter
import com.bytedance.tiktok.base.BaseRvViewHolder
import com.bytedance.tiktok.bean.VideoBean
import com.bytedance.tiktok.utils.NumUtils.numberFilter

/**
 * create by libo
 * create on 2020-05-21
 * description
 */
class WorkAdapter(context: Context, datas: List<VideoBean>) : BaseRvAdapter<VideoBean, WorkViewHolder>(context, datas) {
    override fun onBindData(holder: WorkViewHolder, data: VideoBean, position: Int) {
        holder.ivCover.setImageResource(data.coverRes)
        holder.tvLikeCount.text = numberFilter(data.likeCount)
        holder.itemView.setOnClickListener {
            PlayListActivity.initPos = position
            context.startActivity(Intent(context, PlayListActivity::class.java))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkViewHolder {
        val rooView = LayoutInflater.from(context).inflate(R.layout.item_work, parent, false)
        return WorkViewHolder(rooView)
    }

    class WorkViewHolder(itemView: View) : BaseRvViewHolder(itemView) {
        var ivCover: ImageView = itemView.findViewById(R.id.iv_cover)
        var tvLikeCount: TextView = itemView.findViewById(R.id.tv_likecount)
    }
}