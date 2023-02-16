package com.salim.structural.adapter;

import com.salim.structural.adapter.example.MediaPlayer;

public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.play("mp3", "beyond the horizon.mp3");
        mediaPlayer.play("mp4", "alone.mp4");
        mediaPlayer.play("vlc", "far far away.vlc");
        mediaPlayer.play("avi", "mind me.avi");
    }
}
