package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Verivikasi extends AppCompatActivity {
    public void backScrean(View v){
        onBackPressed();
    }

    public void toSuccesRegis(View v){
        Intent intent = new Intent(Verivikasi.this, BerhasilMendaftarScreen.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verivikasi);
    }
}