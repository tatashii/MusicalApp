package com.example.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class Album_Sherin extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album__sherin);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView=findViewById(R.id.list_view);


        ArrayList<Sherin_ModelClass> sherinarraylist=new ArrayList<>();

        for (int n=0;n<=53;n++) {

            sherinarraylist.add(new Sherin_ModelClass(R.drawable.albumshrein,
                    R.drawable.ic_mywave, "شرين", "مشاعر"));
        }

        SherinArrayAdapter arrayAdapter=new SherinArrayAdapter(this,
               sherinarraylist);


        listView.setAdapter(arrayAdapter);
    }
}
