package com.bytedance.tiktok.view

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

/**
 * create by libo
 * create on 2018/11/20
 * description 用于加载iconfont的TextView
 */
class IconFontTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : AppCompatTextView(context, attrs) {

    companion object {
        /** 所有IconFontTextView公用typeface  */
        private var typeface: Typeface? = null
    }

    init {
        typeface = Typeface.createFromAsset(context.assets, "iconfont.ttf")
    }
}