package com.prototype.pattern.ext;

import com.prototype.pattern.Shape;

/**
 * Create by yangshunfan
 * 2018/1/23 15:16
 */
public class Roundness extends Shape {

    public Roundness() {
        type = "Roundness";
    }

    @Override
    public void draw() {
        System.out.println("draw正方形");
    }
}
