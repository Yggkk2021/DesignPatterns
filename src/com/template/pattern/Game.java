package com.template.pattern;

/**
 * Create by yangshunfan
 * 2018/2/2 17:18
 */
public abstract class Game {
    abstract void initialize();
    abstract void startGame();
    abstract void endGame();

    /**
     * 模板
     */
    public final void paly() {

        //初始化游戏
        initialize();

        //开始游戏
        startGame();

        //结束游戏
        endGame();
    }
}
