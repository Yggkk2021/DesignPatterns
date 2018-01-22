package com.com.singleton.pattern;

/**
 * Create by yangshunfan
 * 2018/1/22 12:27
 *
 * 饿汉模式，方法常用，线程不安全，没有加锁，效率提高
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {}

    public static Singleton3 getInstance() {
        return instance;
    }
}
