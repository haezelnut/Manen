package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IklanProduk extends AppCompatActivity {

    public void backFromIklanProduk(View v){
        Intent intent = new Intent(IklanProduk.this, HomeActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iklan_produk);
    }
}