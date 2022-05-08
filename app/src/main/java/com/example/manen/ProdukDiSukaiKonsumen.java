package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class ProdukDiSukaiKonsumen extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    public void backFromFavorite(View v){
        onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk_di_sukai_konsumen);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager);
        getTabs();
    }

    public void getTabs(){
        final SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                sectionsPagerAdapter.addFragment(new SayuranFavoriteFragment(),"Sayuran");
                sectionsPagerAdapter.addFragment(new BuahFavoriteFragment(),"Buah");
                sectionsPagerAdapter.addFragment(new BahanMakananFavoriteFragment(),"Bahan Makanan");

                viewPager.setAdapter(sectionsPagerAdapter);
                tabLayout.setupWithViewPager(viewPager);
            }
        });
    }
}