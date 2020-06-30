package com.example.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Album_Angham extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album__angham);



       getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView=findViewById(R.id.list_view);
       ArrayList<Angham_ModelClass> anghamarraylist=new ArrayList<>();

       for (int n=0;n<=53;n++) {

           anghamarraylist.add(new Angham_ModelClass(R.drawable.angham_a,
                   R.drawable.ic_mywave, "أنغام", "سيدي وصالك"));
       }

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,
                anghamarraylist);

        listView.setAdapter(arrayAdapter);


    }


}
