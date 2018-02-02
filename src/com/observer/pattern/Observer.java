package com.observer.pattern;

/**
 * Create by yangshunfan
 * 2018/2/2 16:16
 * 观察来
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
