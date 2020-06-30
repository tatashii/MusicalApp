package com.example.musicalapp;

public class Sherin_ModelClass {

        private int sherin_images;
        private int mywave;
        private String singerName;
        private String songName;

        public Sherin_ModelClass(int sherin_images, int mywave, String singerName, String songName) {
            this.sherin_images = sherin_images;
            this.mywave = mywave;
            this.singerName = singerName;
            this.songName = songName;


        }

        public int getSherin_images() {
            return sherin_images;
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


