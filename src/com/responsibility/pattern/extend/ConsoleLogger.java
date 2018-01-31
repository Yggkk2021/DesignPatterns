package com.responsibility.pattern.extend;

import com.responsibility.pattern.AbstractLogger;

/**
 * Create by yangshunfan
 * 2018/1/31 15:49
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("ConsoleLogger:" + message);
    }
}
