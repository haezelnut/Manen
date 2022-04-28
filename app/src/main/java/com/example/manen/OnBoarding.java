package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class OnBoarding extends AppCompatActivity {

    ViewPager viewPager;
    SliderAdapter sliderAdapter;
    Button getStartedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.on_boarding);

        viewPager = findViewById(R.id.slider);
        getStartedBtn = findViewById(R.id.getStartedBtn);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                dots(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager.setAdapter(sliderAdapter);
        dots(0);

        //call adapter
        sliderAdapter = new SliderAdapter(this);

        viewPager.setAdapter(sliderAdapter);

        getStartedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnBoarding.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }


    public void dots(int index)
        {
            LinearLayout dotsLayout = findViewById(R.id.layoutDot);
            ImageView[] dots = new ImageView[4];

            dotsLayout.removeAllViews();
            for (int i = 0;i<dots.length;i++)
            {
                dots[i] = new ImageView(this);
                int width_heigh =25;
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(width_heigh,width_heigh));
                params.setMargins(10,10,10,10);
                dots[i].setLayoutParams(params);
                dots[i].setImageResource(R.drawable.dot);
                dots[i].setColorFilter(getResources().getColor(R.color.teal_200), PorterDuff.Mode.SRC_IN);
                dotsLayout.addView(dots[i]);
            }

            dots[index].setImageResource(R.drawable.dot);
            dots[index].setColorFilter(getResources().getColor(R.color.black), PorterDuff.Mode.SRC_IN);

        }

}