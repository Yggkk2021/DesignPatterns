package com.builder.pattern.model;

import com.builder.pattern.absImpl.ColdDrink;

/**
 * Create by yangshunfan
 * 2018/1/22 13:15
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 10.2f;
    }
}
