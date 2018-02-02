package com.state.pattern;

/**
 * Create by yangshunfan
 * 2018/2/2 16:39
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
