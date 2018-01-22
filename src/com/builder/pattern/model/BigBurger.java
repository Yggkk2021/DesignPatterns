package com.builder.pattern.model;

import com.builder.pattern.absImpl.Burger;

/**
 * Create by yangshunfan
 * 2018/1/22 13:28
 */
public class BigBurger extends Burger {
    @Override
    public String name() {
        return "Big Burger";
    }

    @Override
    public float price() {
        return 100.12f;
    }
}
