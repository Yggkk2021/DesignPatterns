package com.decorator.pattern.service;

/**
 * Create by yangshunfan
 * 2018/1/26 14:36
 * 实现接口的抽象装饰类
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
