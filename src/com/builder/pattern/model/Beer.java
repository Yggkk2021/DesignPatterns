package com.builder.pattern.model;

import com.builder.pattern.absImpl.ColdDrink;

/**
 * Create by yangshunfan
 * 2018/1/22 13:16
 */
public class Beer extends ColdDrink {
    @Override
    public String name() {
        return "Beer";
    }

    @Override
    public float price() {
        return 5.8f;
    }
}
