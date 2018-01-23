package com.adapter.pattern.adapter;

import com.adapter.pattern.inter.AdvancedMediaPlayer;
import com.adapter.pattern.inter.MediaPlayer;
import com.adapter.pattern.model.MP4player;
import com.adapter.pattern.model.VlcPlayer;

/**
 * Create by yangshunfan
 * 2018/1/23 15:49
 */
public class MediaApapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaApapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new MP4player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
