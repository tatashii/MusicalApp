package com.example.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      

        tv1=findViewById(R.id.angham);
        tv2=findViewById(R.id.amal);
        tv3=findViewById(R.id.amer);
        tv4=findViewById(R.id.sherin);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this,Angham.class);
               startActivity(intent);

            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Amal.class);
                startActivity(intent);

            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AmerDiab.class);
                startActivity(intent);

            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Album_Sherin.class);
                startActivity(intent);

            }
        });
    }




























}
