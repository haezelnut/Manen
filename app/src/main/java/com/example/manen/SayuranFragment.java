package com.example.manen;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SayuranFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SayuranFragment extends Fragment {

    private Object SayuranFragment;

    public static SayuranFragment getInstance(){
        SayuranFragment sayuranFragment = new SayuranFragment();
        return sayuranFragment;
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SayuranFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SayurFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SayuranFragment newInstance(String param1, String param2) {
        SayuranFragment fragment = new SayuranFragment();
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
        View view = inflater.inflate(R.layout.fragment_sayur, container, false);
        ImageButton btnDelete = view.findViewById(R.id.btnDelete);
        ImageButton btnEdit = view.findViewById(R.id.btnEdit);
//        Dialog dialog = new Dialog(this);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                openEdit();
                Intent in = new Intent(getActivity(),Produk.class);
                startActivity(in);
            }
//            private void openEdit() {
//                getDialog.setContentView(R.layout.edit_layout);
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
        });
//
//        btnDelete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openDelete();
//            }
//
//            private void openDelete() {
//            }
//        });

        return view;
    }
}