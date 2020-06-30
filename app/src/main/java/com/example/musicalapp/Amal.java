package com.example.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Amal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amal);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
