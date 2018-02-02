package com.template.pattern;

/**
 * Create by yangshunfan
 * 2018/2/2 17:22
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("初始化【足球】游戏");
    }

    @Override
    void startGame() {
        System.out.println("开始【足球】游戏");
    }

    @Override
    void endGame() {
        System.out.println("结束【足球】游戏");
    }
}
