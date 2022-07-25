package com.bytedance.tiktok.view

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

/**
 * create by libo
 * create on 2020-05-21
 * description 跑马灯textview
 */
class MarqueeTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : AppCompatTextView(context, attrs) {

    override fun isFocused(): Boolean {
        return true
    }
}