package com.wada811.kotlinbindingadapter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityBindingAdapter(this, R.layout.activity_main, MainViewModel())
    }
}
