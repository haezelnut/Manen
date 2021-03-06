package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class Produk extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    public void backFromProduct(View v){
        onBackPressed();
    }

    public void produkDiSukai(View v){
        Intent intent = new Intent(Produk.this, ProdukDiSukaiKonsumen.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager);
        getTabs();
    }

    public void getTabs(){
        final SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                sectionsPagerAdapter.addFragment(new ProdukSayuranFragment(),"Sayuran");
                sectionsPagerAdapter.addFragment(new ProdukBuahFragment(),"Buah");
                sectionsPagerAdapter.addFragment(new ProdukBahanMakananFragment(),"Bahan Makanan");

                viewPager.setAdapter(sectionsPagerAdapter);
                tabLayout.setupWithViewPager(viewPager);
            }
        });
    }
}