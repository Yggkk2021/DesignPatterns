package com.adapter.pattern;

import com.adapter.pattern.impl.AudioPlayer;

/**
 * Create by yangshunfan
 * 2018/1/23 15:58
 */
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","我的歌声里.mp3");
        audioPlayer.play("MP4","铁拳男人.mp4");
        audioPlayer.play("vlc","铁甲钢拳.vlc");
        audioPlayer.play("avi","もしも、グラビアアイドル高橋しょう子と結婚したら….avi");
    }
}
