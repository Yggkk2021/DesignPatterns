package com.com.singleton.pattern;

/**
 * Create by yangshunfan
 * 2018/1/22 12:30
 *
 * 双重锁机制，在提高安全性的同时，还能保持高性能
 */
public class Singleton4 {
    //这里增加了volatile关键字，可以保证在读取此线程的可见性
    private volatile static Singleton4 instance;

    private Singleton4() {}

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    return new Singleton4();
                }
            }
        }
        return instance;
    }
}
