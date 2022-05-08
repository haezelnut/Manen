package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MenambahkanProduk extends AppCompatActivity {

    Button btnSimpan;
    Dialog dialog;

    public void backFromMenambahkanProduk(View v){
        onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menambahkan_produk);

        btnSimpan = findViewById(R.id.btnSimpan);
        dialog = new Dialog(this);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBerhasilSimpan();
            }
            private void openBerhasilSimpan() {
                dialog.setContentView(R.layout.berhasil_tambah_produk_layout);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                ImageView imageViewClose = dialog.findViewById(R.id.imageViewClose);
                Button lihatProduk = dialog.findViewById(R.id.lihatProduk);

                imageViewClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        Toast.makeText(MenambahkanProduk.this, "Dialog Close", Toast.LENGTH_SHORT).show();
                    }
                });

                lihatProduk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(MenambahkanProduk.this, TambahProduk.class);
                        startActivity(intent);
                        Toast.makeText(MenambahkanProduk.this, "Produk telah disimpan", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
    }
}