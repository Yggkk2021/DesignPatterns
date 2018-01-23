package com.adapter.pattern.model;

import com.adapter.pattern.inter.AdvancedMediaPlayer;

/**
 * Create by yangshunfan
 * 2018/1/23 15:47
 */
public class MP4player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放MP4格式的文件:" + fileName);
    }
}
