package com.observer.pattern.model;

import com.observer.pattern.Observer;
import com.observer.pattern.Subject;

/**
 * Create by yangshunfan
 * 2018/2/2 16:27
 * 十六进制观察者
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String:" + Integer.toHexString(subject.getState()));
    }
}
