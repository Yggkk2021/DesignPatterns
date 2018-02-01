package com.expression.pattern.model;

import com.expression.pattern.Expression;

/**
 * Create by yangshunfan
 * 2018/2/1 12:59
 * 终端解释类
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        //context是否包含data
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
