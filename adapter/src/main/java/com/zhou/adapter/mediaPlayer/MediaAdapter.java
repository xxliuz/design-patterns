package com.zhou.adapter.mediaPlayer;

import com.zhou.adapter.advancedMediaPlayer.AdvancedMediaPlayer;
import com.zhou.adapter.advancedMediaPlayer.Mp4Play;
import com.zhou.adapter.advancedMediaPlayer.VlcPlay;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/22 10:23
 * @Description: 适配器
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Play();
        }else if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlay();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
