package com.adapter.pattern.model;

import com.adapter.pattern.inter.AdvancedMediaPlayer;

/**
 * Create by yangshunfan
 * 2018/1/23 15:46
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放Vlc格式的文件:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
