package com.salim.structural.adapter.example;

public class MediaPlayer {
    private final MediaAdapter mediaAdapter;

    public MediaPlayer() {
        this.mediaAdapter = new MediaAdapter();
    }

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3"))
            System.out.println("Playing mp3 file. Name: " + fileName);
        else
            mediaAdapter.play(audioType, fileName);
    }
}
