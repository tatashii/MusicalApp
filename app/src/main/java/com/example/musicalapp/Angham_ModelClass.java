package com.example.musicalapp;

import java.util.ArrayList;

public class Angham_ModelClass {
    private int  angham_images;
    private int mywave;
    private String singerName;
    private String songName;

    public Angham_ModelClass(int  angham_images,int mywave,String singerName, String songName) {
        this.angham_images=angham_images;
        this.mywave=mywave;
        this.singerName=singerName;
        this.songName=songName;


    }

    public int getAngham_images() {
        return angham_images;
    }

    public int getMywave() {
        return mywave;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getSongName() {
        return songName;
    }

}
