package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class TambahProduk extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
//    ImageButton btnDelete,btnEdit;
//    Dialog dialog;

    public void backFromInputProduct(View v){
        Intent intent = new Intent(TambahProduk.this, HomeActivity.class);
        startActivity(intent);
    }

    public void tambahProduk(View v){
        Intent intent = new Intent(TambahProduk.this, MenambahkanProduk.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_produk);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager);
        getTabs();


//        Edit dan delet
//        btnDelete = findViewById(R.id.btnDelete);
//        btnEdit = findViewById(R.id.btnEdit);
//        dialog = new Dialog(this);
//
//        btnEdit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openEdit();
//            }
//            private void openEdit() {
//                dialog.setContentView(R.layout.edit_layout);
//                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//
//                ImageView imageViewClose = dialog.findViewById(R.id.imageViewClose);
//                Button btnSimpan = dialog.findViewById(R.id.btnSimpan);
//
//                imageViewClose.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        dialog.dismiss();
//                        Toast.makeText(TambahProduk.this, "Dialog Close", Toast.LENGTH_SHORT).show();
//                    }
//                });
//
//                btnSimpan.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        dialog.dismiss();
//                        Toast.makeText(TambahProduk.this, "Produk telah diubah", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                dialog.show();
//            }
//        });
//
//        btnDelete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//            openDelete();
//            }
//
//            private void openDelete() {
//            }
//        });



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