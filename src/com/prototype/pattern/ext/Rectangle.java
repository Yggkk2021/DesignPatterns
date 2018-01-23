package com.prototype.pattern.ext;

import com.prototype.pattern.Shape;

/**
 * Create by yangshunfan
 * 2018/1/23 15:10
 * 扩展Shape抽象类
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("draw长方形");
    }
}
