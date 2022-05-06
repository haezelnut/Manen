package com.example.manen;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class RatingProdukFragment extends Fragment {
    Spinner spinnerWaktuRatingProduk;
    Spinner spinnerJumlahUlasanRatingProduk;

    String[] waktu={"1 Tahun Terakhir","6 Bulan Terakhir","1 Bulan Terakhir","1 Minggu Terakhir","24 Jam Terakhir"};
    String[] jumlahUlasan={"Ulasan Terbanyak", "Bintang 5", "Bintang 4", "Bintang 3", "Bintang 2", "Bintang 1","Sedikit diulas"};

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){

        spinnerWaktuRatingProduk = getView().findViewById(R.id.spinnerWaktuRating);
        spinnerJumlahUlasanRatingProduk = getView().findViewById(R.id.spinnerJumlahUlasanRating);

        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, waktu);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerWaktuRatingProduk.setAdapter(adapter1);

        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, jumlahUlasan);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJumlahUlasanRatingProduk.setAdapter(adapter2);

        spinnerWaktuRatingProduk.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), waktu[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerJumlahUlasanRatingProduk.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), jumlahUlasan[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rating_produk, container, false);
    }
}