package com.strategy.pattern;

/**
 * Create by yangshunfan
 * 2018/2/2 17:00
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行操作
     * @param num1
     * @param num2
     */
    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1,num2);
    }
}
