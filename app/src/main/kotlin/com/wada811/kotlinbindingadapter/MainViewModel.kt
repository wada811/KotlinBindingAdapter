package com.wada811.kotlinbindingadapter

import android.util.Log
import android.view.View

class MainViewModel {
    var javaText: String = "Java"
    var javaClick: View.OnClickListener = View.OnClickListener { Log.i("View.OnClickListener", "javaClick") }
    var kotlinText: String = "Kotlin"
    var kotlinClick: View.OnClickListener = View.OnClickListener { Log.i("View.OnClickListener", "kotlinClick") }
    var kotlinExText: String = "KotlinEx"
    var kotlinExClick: View.OnClickListener = View.OnClickListener { Log.i("View.OnClickListener", "kotlinExClick") }
}