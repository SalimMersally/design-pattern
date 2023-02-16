package com.salim.structural.adapter.example;

public class MediaAdapter {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter() {
        advancedMusicPlayer = new AdvancedMediaPlayer();
    }

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMusicPlayer.playVlc(fileName);
        else if(audioType.equalsIgnoreCase("mp4"))
            advancedMusicPlayer.playMp4(fileName);
        else
            System.out.println("ERROR: This extension is not supported");
    }
}
