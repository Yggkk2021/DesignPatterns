package com.facade.pattern.service;

import com.facade.pattern.Model.Rectangle;
import com.facade.pattern.Model.Roundness;
import com.facade.pattern.Model.Square;

/**
 * Create by yangshunfan
 * 2018/1/26 14:57
 */
public class ShapeMaker {
    private Shape rectangle;

    private Shape roundness;

    private Shape square;

    /**
     * 在构造方法内直接创建对象，若需要使用直接创建本类
     */
    public ShapeMaker() {
        rectangle = new Rectangle();
        roundness = new Roundness();
        square = new Square();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawRoundness() {
        roundness.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
