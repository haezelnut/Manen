package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class Pesanan extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;


    public void backFromOrder(View v){
        onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager);
        getTabs();
    }

    public void getTabs(){
        final SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                sectionsPagerAdapter.addFragment(new DiKomplainFragment(),"Dikomplain");
                sectionsPagerAdapter.addFragment(new PesananSelesaiFragment(),"Pesanan Selesai");

                viewPager.setAdapter(sectionsPagerAdapter);
                tabLayout.setupWithViewPager(viewPager);
            }
        });
    }
}