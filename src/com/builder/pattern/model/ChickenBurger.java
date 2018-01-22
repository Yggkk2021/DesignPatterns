package com.builder.pattern.model;

import com.builder.pattern.absImpl.Burger;

/**
 * Create by yangshunfan
 * 2018/1/22 13:14
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 30.3f;
    }
}
