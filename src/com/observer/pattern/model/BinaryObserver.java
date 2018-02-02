package com.observer.pattern.model;

import com.observer.pattern.Observer;
import com.observer.pattern.Subject;

/**
 * Create by yangshunfan
 * 2018/2/2 16:19
 * 二进制观察者
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        //返回int变量的二进制表示的字符串
        System.out.println("Binary String:" + Integer.toBinaryString(subject.getState()));
    }
}
