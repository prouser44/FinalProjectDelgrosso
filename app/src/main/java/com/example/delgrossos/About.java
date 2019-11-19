package com.example.delgrossos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        HomeBttnFragment hb = new HomeBttnFragment();
        ft.add(R.id.aboutContainer, hb);
        ft.commit();
    }
}
