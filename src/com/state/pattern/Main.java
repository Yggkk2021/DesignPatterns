package com.state.pattern;

import com.state.pattern.service.StartState;
import com.state.pattern.service.StopState;

/**
 * Create by yangshunfan
 * 2018/2/2 16:49
 * 状态模式
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
