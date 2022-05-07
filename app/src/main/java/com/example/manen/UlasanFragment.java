package com.example.manen;

import android.os.Bundle;

import androidx.annotation.ContentView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UlasanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UlasanFragment extends Fragment {

    TabLayout tabLayoutUlasan;
    ViewPager viewPagerUlasan;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        tabLayoutUlasan = getView().findViewById(R.id.tabLayoutUlasan);
        viewPagerUlasan = getView().findViewById(R.id.viewPageUlasan);

        getTabs();
        //tabLayoutUlasan.setupWithViewPager(viewPagerUlasan);

        /*UlasanAdaptor ulasanAdaptor = new UlasanAdaptor(getFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        ulasanAdaptor.addFragment(new RatingProdukFragment(),"Rating");
        ulasanAdaptor.addFragment(new PenilaianPembeliFragment(),"Penilaian");
        viewPagerUlasan.setAdapter(ulasanAdaptor); */
    }

    public void getTabs(){
        final SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                sectionsPagerAdapter.addFragment(new RatingProdukFragment(),"Rating Produk");
                sectionsPagerAdapter.addFragment(new PenilaianPembeliFragment(),"Penilaian Penjual");

                viewPagerUlasan.setAdapter(sectionsPagerAdapter);
                tabLayoutUlasan.setupWithViewPager(viewPagerUlasan);
            }
        });
    }

    public UlasanFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UlasanFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UlasanFragment newInstance(String param1, String param2) {
        UlasanFragment fragment = new UlasanFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ulasan, container, false);
    }

}