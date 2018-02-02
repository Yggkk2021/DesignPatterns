package com.observer.pattern.model;

import com.observer.pattern.Observer;
import com.observer.pattern.Subject;

/**
 * Create by yangshunfan
 * 2018/2/2 16:23
 * 八进制观察者
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String:" + Integer.toOctalString(subject.getState()));
    }
}
