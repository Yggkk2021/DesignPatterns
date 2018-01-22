package com.builder.pattern.absImpl;

import com.builder.pattern.service.Item;
import com.builder.pattern.service.Packing;
import com.builder.pattern.service.impl.Bottle;

/**
 * Create by yangshunfan
 * 2018/1/22 13:11
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
