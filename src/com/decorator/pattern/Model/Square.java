package com.decorator.pattern.Model;

import com.decorator.pattern.service.Shape;

/**
 * Create by yangshunfan
 * 2018/1/26 14:34
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
