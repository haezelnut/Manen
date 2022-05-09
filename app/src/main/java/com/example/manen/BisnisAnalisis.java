package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BisnisAnalisis extends AppCompatActivity {

    public void backFromBisnis(View v){
        Intent intent = new Intent(BisnisAnalisis.this, HomeActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisnis_analisis);
    }
}