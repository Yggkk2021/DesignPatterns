package com.template.pattern;

/**
 * Create by yangshunfan
 * 2018/2/2 17:23
 * 模板模式
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Basketball();
        game.paly();
        System.out.println();

        game = new Football();
        game.paly();
    }
}
