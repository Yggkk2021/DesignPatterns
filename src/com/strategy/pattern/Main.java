package com.strategy.pattern;

import com.strategy.pattern.impl.OperationAdd;
import com.strategy.pattern.impl.OperationMultiply;
import com.strategy.pattern.impl.OperationSubstract;

/**
 * Create by yangshunfan
 * 2018/2/2 17:02
 */
public class Main {
    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("100 * 10 = " + context.executeStrategy(100,10));

        context = new Context(new OperationSubstract());
        System.out.println("50 - 25 = " + context.executeStrategy(50,25));
    }
}
