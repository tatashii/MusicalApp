package com.example.musicalapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Angham extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angham);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button=findViewById(R.id.album_angham);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Angham.this,Album_Angham.class);
                startActivity(intent);
            }
        });
    }
}
