package com.wada811.kotlinbindingadapter.binding

import android.databinding.BindingAdapter
import android.view.View
import android.widget.Button
import android.widget.TextView

@BindingAdapter("kotlinExText")
fun TextView.setKotlinExText(text: String) = this.setText(text)

@BindingAdapter("kotlinExClick")
fun Button.setKotlinExClick(listener: View.OnClickListener) = this.setOnClickListener(listener)