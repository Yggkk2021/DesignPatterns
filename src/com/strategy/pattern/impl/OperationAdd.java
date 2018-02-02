package com.strategy.pattern.impl;

import com.strategy.pattern.Strategy;

/**
 * Create by yangshunfan
 * 2018/2/2 16:58
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
