package com.wada811.kotlinbindingadapter.binding

import android.databinding.BindingAdapter
import android.view.View
import android.widget.Button
import android.widget.TextView

object KotlinBindingAdapter {
    @BindingAdapter("kotlinText")
    @JvmStatic
    fun setKotlinText(view: TextView, text: String) {
        view.text = text
    }

    @BindingAdapter("kotlinClick")
    @JvmStatic
    fun setKotlinClick(view: Button, listener: View.OnClickListener) {
        view.setOnClickListener(listener)
    }
}