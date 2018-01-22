package com.com.singleton.pattern;

/**
 * Create by yangshunfan
 * 2018/1/22 12:21
 *
 * 懒汉模式,没有线程安全，不支持多线程，没有加锁synchronized
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {}

    public static Singleton1 getInstance() {
        if(instance == null) {
            return new Singleton1();
        }
        return instance;
    }
}
