package com.bytedance.tiktok.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bytedance.tiktok.R
import com.bytedance.tiktok.adapter.PrivateLetterAdapter.PrivateLetterViewHolder
import com.bytedance.tiktok.base.BaseRvAdapter
import com.bytedance.tiktok.base.BaseRvViewHolder
import com.bytedance.tiktok.bean.VideoBean.UserBean

/**
 * create by libo
 * create on 2020-05-25
 * description
 */
class PrivateLetterAdapter(context: Context, datas: List<UserBean>) : BaseRvAdapter<UserBean, PrivateLetterViewHolder>(context, datas) {
    override fun onBindData(holder: PrivateLetterViewHolder, data: UserBean, position: Int) {
        holder.ivHead.setImageResource(data.head)
        holder.tvName.text = data.nickName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrivateLetterViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_private_letter, parent, false)
        return PrivateLetterViewHolder(view)
    }

    class PrivateLetterViewHolder(itemView: View) : BaseRvViewHolder(itemView) {
        var ivHead: ImageView = itemView.findViewById(R.id.iv_head)
        var tvName: TextView = itemView.findViewById(R.id.tv_nickname)
    }
}