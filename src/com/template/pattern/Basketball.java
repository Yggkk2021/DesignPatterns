package com.template.pattern;

/**
 * Create by yangshunfan
 * 2018/2/2 17:21
 */
public class Basketball extends Game {
    @Override
    void initialize() {
        System.out.println("初始化【篮球】游戏");
    }

    @Override
    void startGame() {
        System.out.println("开始【篮球】游戏");
    }

    @Override
    void endGame() {
        System.out.println("结束【篮球】游戏");
    }
}
