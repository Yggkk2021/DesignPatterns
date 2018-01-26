package com.facade.pattern;

import com.facade.pattern.service.ShapeMaker;

/**
 * Create by yangshunfan
 * 2018/1/26 15:00
 */
public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawRectangle();
        shapeMaker.drawRoundness();
        shapeMaker.drawSquare();
    }
}
