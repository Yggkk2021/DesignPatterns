package com.memento.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by yangshunfan
 * 2018/2/2 16:02
 * 看守类
 */
public class CareTaker {
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}
