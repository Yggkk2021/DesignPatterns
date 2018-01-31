package com.responsibility.pattern.extend;

import com.responsibility.pattern.AbstractLogger;

/**
 * Create by yangshunfan
 * 2018/1/31 15:51
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("ErrorLogger:" + message);
    }
}
