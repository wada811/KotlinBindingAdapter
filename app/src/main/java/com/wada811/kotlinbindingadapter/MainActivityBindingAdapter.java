package com.wada811.kotlinbindingadapter;

import android.databinding.DataBindingUtil;
import com.wada811.kotlinbindingadapter.databinding.ActivityMainBinding;

public class MainActivityBindingAdapter {
    public MainActivityBindingAdapter(MainActivity activity, int layoutId, MainViewModel viewModel){
        ActivityMainBinding binding =  DataBindingUtil.setContentView(activity, layoutId);
        binding.setViewModel(viewModel);
    }
}
