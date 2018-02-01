package com.expression.pattern;

import com.expression.pattern.model.AndExpression;
import com.expression.pattern.model.OrExpression;
import com.expression.pattern.model.TerminalExpression;

/**
 * Create by yangshunfan
 * 2018/2/1 13:07
 * 解释器模式
 * Main类使用Expression类来创建规则，病解析它们
 */
public class Main {
    /**
     * 规则：ysf是男性
     */
    public static Expression getMaleExpression() {
        Expression ysf = new TerminalExpression("ysf");
        Expression male = new TerminalExpression("male");
        return new OrExpression(ysf,male);
    }

    /**
     * 规则：zmz是一个已婚女性
     */
    public static Expression getMarriedWomanExpression() {
        Expression zmz = new TerminalExpression("zmz");
        Expression married = new TerminalExpression("married");
        return new AndExpression(zmz,married);
    }

    /**
     * 主方法
     */
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression marriedWoman = getMarriedWomanExpression();

        System.out.println("Ysf is man?" + isMale.interpret("ysf"));
        System.out.println("Zmz is married women?" + marriedWoman.interpret("married zmz"));
    }
}
