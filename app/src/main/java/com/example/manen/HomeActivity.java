package com.example.manen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {
    BottomNavigationView bottomAppBar;


    public void addProduct(View v){
        Intent intent = new Intent(HomeActivity.this, TambahProduk.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

     //   appBar = findViewById(R.id.nav_bot);;
        bottomAppBar = findViewById(R.id.nav_bot);
        bottomAppBar.setBackground(null);
        bottomAppBar.getMenu().getItem(2).setEnabled(false);
     //   appBar.replaceMenu(R.menu.bottom_nav_bar);

       getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new HomeFragment()).commit();

       bottomAppBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               Fragment temp = null;
               switch (item.getItemId()){
                   case R.id.home:
                       getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new HomeFragment()).commit();
                       break;
                   case R.id.chat :  getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new PesanFragment()).commit();
                       break;
                   case R.id.Reviewer:  getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new UlasanFragment()).commit();
                       break;
                   case R.id.Setting:  getSupportFragmentManager().beginTransaction().replace(R.id.main_container,new PengaturanFragment()).commit();
                        break;

               }


               return false;
           }
       });

    }
}