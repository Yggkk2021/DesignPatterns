package com.observer.pattern;

import com.observer.pattern.model.BinaryObserver;
import com.observer.pattern.model.HexaObserver;
import com.observer.pattern.model.OctalObserver;

/**
 * Create by yangshunfan
 * 2018/2/2 16:29
 * 观察者模式7
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("First state change:15");
        subject.setState(15);
        System.out.println("Second state change:20");
        subject.setState(20);
    }
}
