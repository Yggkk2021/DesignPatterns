package com.builder.pattern.service.impl;

import com.builder.pattern.service.Packing;

/**
 * Create by yangshunfan
 * 2018/1/22 13:04
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Packing";
    }
}
