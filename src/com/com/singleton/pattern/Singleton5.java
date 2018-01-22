package com.com.singleton.pattern;

/**
 * Create by yangshunfan
 * 2018/1/22 12:35
 *
 * 通过静态内部类创建单例
 * 能达到双重检测一样的功效，但实现跟简单
 */
public class Singleton5 {
    public static class LazeLoder {
        public static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5() {}

    public static Singleton5 getInstance() {
        return LazeLoder.INSTANCE;
    }
}
