package com.example.manen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    TextView textBold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // membuat kata bold "syarat dan ketentuan" pada text view id:textFooterRegister
        textBold = (TextView) findViewById(R.id.textFooterRegister);
        String text = "Dengan mendaftar sebagai seller, anda nmenyetujui syarat & ketentuan";
        SpannableString ss = new SpannableString(text);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss.setSpan(boldSpan,59, 67.Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textBold.setText(ss);
    }
}