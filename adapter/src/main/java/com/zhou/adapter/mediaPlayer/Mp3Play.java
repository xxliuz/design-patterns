package com.zhou.adapter.mediaPlayer;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/22 10:29
 * @Description: mp3 播放器
 */
@Slf4j
public class Mp3Play implements MediaPlayer {

    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        //Mp3Play的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            log.info("Playing mp3 file. Name: "+ fileName);
        }//mediaAdapter 提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            UnsupportedOperationException e = new UnsupportedOperationException();
            log.error(e.getMessage());
            throw e;
        }
    }
}
