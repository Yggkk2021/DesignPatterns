package com.prototype.pattern.ext;

import com.prototype.pattern.Shape;

/**
 * Create by yangshunfan
 * 2018/1/23 15:15
 */
public class Square extends Shape{

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("draw正方形");
    }
}
