package com.mediator.pattern;

/**
 * Create by yangshunfan
 * 2018/2/1 14:19
 * 中介者模式
 */
public class Main {
    public static void main(String[] args) {
        User ysf = new User("yangshunfan");
        User kobe = new User("Kobe");

        ysf.sendMessage("Hi! Kobe");
        kobe.sendMessage("Hi! yangshunfan");
    }
}
