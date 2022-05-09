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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PenilaianPembeliFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PenilaianPembeliFragment extends Fragment {

    Spinner spinnerWaktuRatingProduk;
    Spinner spinnerJumlahUlasanRatingProduk;

    String[] waktu={"1 Tahun Terakhir","6 Bulan Terakhir","1 Bulan Terakhir","1 Minggu Terakhir","24 Jam Terakhir"};
    String[] jumlahUlasan={"Ulasan Terbanyak", "Bintang 5", "Bintang 4", "Bintang 3", "Bintang 2", "Bintang 1","Sedikit diulas"};


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){

        spinnerWaktuRatingProduk = getView().findViewById(R.id.spinnerWaktuRating);
        spinnerJumlahUlasanRatingProduk = getView().findViewById(R.id.spinnerJumlahUlasanRating);

        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(getContext(), R.layout.my_selected_item, waktu);
        adapter1.setDropDownViewResource(R.layout.my_dropdown_item);
        spinnerWaktuRatingProduk.setAdapter(adapter1);

        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(getContext(), R.layout.my_selected_item, jumlahUlasan);
        adapter2.setDropDownViewResource(R.layout.my_dropdown_item);
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

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PenilaianPembeliFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PenilaianPembeliFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PenilaianPembeliFragment newInstance(String param1, String param2) {
        PenilaianPembeliFragment fragment = new PenilaianPembeliFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_penilaian_pembeli, container, false);
    }
}