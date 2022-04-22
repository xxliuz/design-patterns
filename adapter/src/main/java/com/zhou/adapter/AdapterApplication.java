package com.zhou.adapter;


import com.zhou.adapter.mediaPlayer.Mp3Play;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdapterApplication {

    public static void main(String[] args) {
        Mp3Play mp3Play = new Mp3Play();
        mp3Play.play("mp3", "beyond the horizon.mp3");
        mp3Play.play("mp4", "alone.mp4");
        mp3Play.play("vlc", "far far away.vlc");
        mp3Play.play("avi", "mind me.avi");
    }

}
