package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MenambahkanProduk extends AppCompatActivity {

    public void backFromMenambahkanProduk(View v){
        onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menambahkan_produk);
    }
}