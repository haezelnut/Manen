package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class TambahProduk extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    public void backFromInputProduct(View v){
        onBackPressed();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_produk);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager);
        getTabs();
    }

    public void getTabs(){
        final SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                sectionsPagerAdapter.addFragment(SayuranFragment.getInstance(),"Sayuran");
                sectionsPagerAdapter.addFragment(BuahFragment.getInstance(),"Buah");
                sectionsPagerAdapter.addFragment(HasilTernakFragment.getInstance(),"Hasil Ternak");

                viewPager.setAdapter(sectionsPagerAdapter);
                tabLayout.setupWithViewPager(viewPager);
            }
        });
    }
}