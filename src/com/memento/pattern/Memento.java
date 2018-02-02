package com.memento.pattern;

/**
 * Create by yangshunfan
 * 2018/2/2 15:57
 * 备忘录类
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
