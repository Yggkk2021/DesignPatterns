package com.com.singleton.pattern;

/**
 * Create by yangshunfan
 * 2018/1/22 12:24
 *
 * 懒汉模式，线程安全
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {}

    //这里添加了关键字synchronized，保证线程安全，但效率低
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            return new Singleton2();
        }
        return instance;
    }
}
