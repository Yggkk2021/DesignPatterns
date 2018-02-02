package com.state.pattern.service;

import com.state.pattern.Context;
import com.state.pattern.State;

/**
 * Create by yangshunfan
 * 2018/2/2 16:40
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
