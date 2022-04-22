package com.zhou.adapter.advancedMediaPlayer;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/22 10:16
 * @Description: mp4播放器
 */
@Slf4j
public class Mp4Play implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        UnsupportedOperationException e = new UnsupportedOperationException();
        log.error(e.getMessage(),e);
        throw e;
    }

    @Override
    public void playMp4(String fileName) {
        log.info("Playing mp4 file. Name: "+ fileName);
    }
}
