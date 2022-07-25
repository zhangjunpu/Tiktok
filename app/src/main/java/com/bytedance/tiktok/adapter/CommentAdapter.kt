package com.bytedance.tiktok.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bytedance.tiktok.R
import com.bytedance.tiktok.adapter.CommentAdapter.CommentViewHolder
import com.bytedance.tiktok.base.BaseRvAdapter
import com.bytedance.tiktok.base.BaseRvViewHolder
import com.bytedance.tiktok.bean.CommentBean
import com.bytedance.tiktok.utils.NumUtils.numberFilter
import com.bytedance.tiktok.view.CircleImageView

/**
 * create by libo
 * create on 2020-05-24
 * description
 */
class CommentAdapter(context: Context, datas: List<CommentBean>) : BaseRvAdapter<CommentBean, CommentViewHolder>(context, datas) {
    override fun onBindData(holder: CommentViewHolder, data: CommentBean, position: Int) {
        holder.ivHead.setImageResource(data.userBean!!.head)
        holder.tvNickname.text = data.userBean!!.nickName
        holder.tvContent.text = data.content
        holder.tvLikecount.text = numberFilter(data.likeCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_comment, parent, false)
        return CommentViewHolder(view)
    }

    class CommentViewHolder(itemView: View) : BaseRvViewHolder(itemView) {
        var ivHead: CircleImageView = itemView.findViewById(R.id.iv_head)
        var tvNickname: TextView = itemView.findViewById(R.id.tv_nickname)
        var tvContent: TextView = itemView.findViewById(R.id.tv_content)
        var tvLikecount: TextView = itemView.findViewById(R.id.tv_likecount)
    }
}