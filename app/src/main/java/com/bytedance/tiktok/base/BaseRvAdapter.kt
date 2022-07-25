package com.bytedance.tiktok.base

import android.content.Context
import androidx.recyclerview.widget.RecyclerView

/**
 * create by libo
 * create on 2018/11/15
 * description RecyclerAdapter基类
 * tip多套布局T传Object类型，其他直接传具体类型
 */
abstract class BaseRvAdapter<T, VH : BaseRvViewHolder>(val context: Context, var data: List<T>) : RecyclerView.Adapter<VH>() {

    override fun onBindViewHolder(holder: VH, position: Int) {
        onBindData(holder, data[position], position)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    protected abstract fun onBindData(holder: VH, data: T, position: Int)

    fun addData(item: T) {
        (data as MutableList).add(item)
        notifyDataSetChanged()
    }

    fun addDataToPostion(item: T, position: Int) {
        (data as MutableList).add(position, item)
        notifyItemInserted(position)
    }

    fun addDatas(list: List<T>) {
        val oldCount = data.size
        (data as MutableList).addAll(list)
        notifyItemRangeInserted(oldCount, list.size)
    }

    fun removeDataFromPosition(position: Int) {
        (data as MutableList).removeAt(position)
        notifyDataSetChanged()
    }

    fun onlyRemoveItem(position: Int) {
        (data as MutableList).removeAt(position)
    }

    fun clearDatas() {
        (data as MutableList).clear()
        notifyDataSetChanged()
    }
}