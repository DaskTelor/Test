package com.dasktelor.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.dasktelor.test.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ClickerViewModel viewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(ClickerViewModel.class);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
    }
}