package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BerhasilMendaftarScreen extends AppCompatActivity {

    public void toHomeScreen(View v){
        Intent intent = new Intent(BerhasilMendaftarScreen.this, HomeActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berhasil_mendaftar_screen);
    }
}