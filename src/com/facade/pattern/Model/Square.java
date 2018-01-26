package com.facade.pattern.Model;

import com.facade.pattern.service.Shape;

/**
 * Create by yangshunfan
 * 2018/1/26 14:55
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
