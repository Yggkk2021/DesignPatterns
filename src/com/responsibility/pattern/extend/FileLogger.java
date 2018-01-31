package com.responsibility.pattern.extend;

import com.responsibility.pattern.AbstractLogger;

/**
 * Create by yangshunfan
 * 2018/1/31 15:52
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("FileLogger:" + message);
    }
}
