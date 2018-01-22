package com.builder.pattern.absImpl;

import com.builder.pattern.service.Item;
import com.builder.pattern.service.Packing;
import com.builder.pattern.service.impl.Wrapper;

/**
 * Create by yangshunfan
 * 2018/1/22 13:10
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
