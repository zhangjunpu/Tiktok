package com.bytedance.tiktok.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bytedance.tiktok.R
import com.bytedance.tiktok.adapter.FansAdapter.FansViewHolder
import com.bytedance.tiktok.base.BaseRvAdapter
import com.bytedance.tiktok.base.BaseRvViewHolder
import com.bytedance.tiktok.bean.VideoBean.UserBean
import com.bytedance.tiktok.view.CircleImageView

/**
 * create by libo
 * create on 2020-05-24
 * description
 */
class FansAdapter(context: Context, datas: List<UserBean>) : BaseRvAdapter<UserBean, FansViewHolder>(context, datas) {
    override fun onBindData(holder: FansViewHolder, data: UserBean, position: Int) {
        holder.ivHead.setImageResource(data.head)
        holder.tvNickname.text = data.nickName
        holder.tvFocus.text = if (data.isFocused) "已关注" else "关注"
        holder.tvFocus.setOnClickListener { v: View? ->
            if (!data.isFocused) {
                holder.tvFocus.text = "已关注"
                holder.tvFocus.setBackgroundResource(R.drawable.shape_round_halfwhite)
            } else {
                holder.tvFocus.text = "关注"
                holder.tvFocus.setBackgroundResource(R.drawable.shape_round_red)
            }
            data.isFocused = !data.isFocused
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FansViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_fans, parent, false)
        return FansViewHolder(view)
    }

    class FansViewHolder(itemView: View) : BaseRvViewHolder(itemView) {
        var ivHead: CircleImageView = itemView.findViewById(R.id.iv_head)
        var tvNickname: TextView = itemView.findViewById(R.id.tv_nickname)
        var tvFocus: TextView = itemView.findViewById(R.id.tv_focus)
    }
}