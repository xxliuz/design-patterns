package com.zhou.adapter.advancedMediaPlayer;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/22 10:10
 * @Description: Vlc播放器
 */
@Slf4j
public class VlcPlay implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        log.info("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        UnsupportedOperationException e = new UnsupportedOperationException();
        log.error(e.getMessage(),e);
        throw e;
    }
}
