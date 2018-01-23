package com.adapter.pattern.impl;

import com.adapter.pattern.adapter.MediaApapter;
import com.adapter.pattern.inter.MediaPlayer;

/**
 * Create by yangshunfan
 * 2018/1/23 15:54
 */
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {

        //播放MP3格式的音乐
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("播放MP3格式的音乐：" + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") ||
                audioType.equalsIgnoreCase("mp4")) {
            MediaPlayer mediaPlayer = new MediaApapter(audioType);
            mediaPlayer.play(audioType,fileName);
        } else {
            System.out.println("您的文件有误");
        }
    }
}
