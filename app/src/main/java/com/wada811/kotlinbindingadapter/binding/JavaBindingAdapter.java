package com.wada811.kotlinbindingadapter.binding;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JavaBindingAdapter {
    @BindingAdapter("javaText")
    public static void setJavaText(TextView view, String text){
        view.setText(text);
    }

    @BindingAdapter("javaClick")
    public static void setJavaClick(Button view, final View.OnClickListener listener){
        view.setOnClickListener(listener);
    }
}
