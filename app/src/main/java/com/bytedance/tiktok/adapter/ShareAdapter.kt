package com.bytedance.tiktok.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bytedance.tiktok.R
import com.bytedance.tiktok.adapter.ShareAdapter.ShareViewHolder
import com.bytedance.tiktok.base.BaseRvAdapter
import com.bytedance.tiktok.base.BaseRvViewHolder
import com.bytedance.tiktok.bean.ShareBean

/**
 * create by libo
 * create on 2020-05-25
 * description
 */
class ShareAdapter(context: Context, datas: List<ShareBean>) : BaseRvAdapter<ShareBean, ShareViewHolder>(context, datas) {
    override fun onBindData(holder: ShareViewHolder, data: ShareBean, position: Int) {
        holder.tvIcon.setText(data.iconRes)
        holder.tvText.text = data.text
        holder.viewBg.setBackgroundResource(data.bgRes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShareViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_share, parent, false)
        return ShareViewHolder(view)
    }

    class ShareViewHolder(itemView: View) : BaseRvViewHolder(itemView) {
        var tvIcon: TextView = itemView.findViewById(R.id.tv_icon)
        var tvText: TextView = itemView.findViewById(R.id.tv_text)
        var viewBg: View = itemView.findViewById(R.id.view_bg)
    }
}