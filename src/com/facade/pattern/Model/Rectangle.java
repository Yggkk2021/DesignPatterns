package com.facade.pattern.Model;

import com.facade.pattern.service.Shape;

/**
 * Create by yangshunfan
 * 2018/1/26 14:54
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
