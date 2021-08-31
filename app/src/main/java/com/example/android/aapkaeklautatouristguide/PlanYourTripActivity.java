package com.example.android.aapkaeklautatouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PlanYourTripActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.activity_planyourtrip);
    }
}