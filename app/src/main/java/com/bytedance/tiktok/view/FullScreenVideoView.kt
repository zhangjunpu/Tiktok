package com.bytedance.tiktok.view

import android.content.Context
import android.util.AttributeSet
import android.widget.VideoView

/**
 * create by libo
 * create on 2018/12/20
 * description 全屏播放Videoview
 */
class FullScreenVideoView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : VideoView(context, attrs) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(getDefaultSize(0, widthMeasureSpec), getDefaultSize(0, heightMeasureSpec))
    }
}