package com.factory.pattern;

/**
 * Create by yangshunfan
 * 2018/1/20 20:54
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //由工厂类创建正方形类
        Shape shapeSquare = shapeFactory.getShape("Square");
        //调用draw方法
        shapeSquare.draw();

        //由工厂类创建长方形类
        Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");
        //调用draw方法
        shapeRectangle.draw();

        //由工厂类创建圆形类
        Shape shapeRoundness = shapeFactory.getShape("ROUNDNESS");
        //调用draw方法
        shapeRoundness.draw();
    }
}
