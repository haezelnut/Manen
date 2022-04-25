package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


public class OnBoarding extends AppCompatActivity {

    ViewPager viewPager;
    SliderAdapter sliderAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.on_boarding);
        getSupportActionBar().hide();

        viewPager = findViewById(R.id.slider);

        //call adapter
        sliderAdapter = new SliderAdapter(this);

        viewPager.setAdapter(sliderAdapter);
    }
}