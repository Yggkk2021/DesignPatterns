package com.abs.factory.pattern;

import com.abs.factory.pattern.model.color.Color;
import com.abs.factory.pattern.model.color.shape.Shape;

/**
 * Create by yangshunfan
 * 2018/1/20 21:23
 */
public class Main {
    public static void main(String[] args) {
        //1. 获取形状工厂
        AbsFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        assert shapeFactory != null;

        //1.1 获取正方形
        Shape shapeSquare = shapeFactory.getShape("SQUARE");

        //1.2 执行draw方法
        shapeSquare.draw();

        //1.3 获取长方形
        Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");

        //1.4 执行draw方法
        shapeRectangle.draw();

        //1.5 获取圆形
        Shape shapeRoundness = shapeFactory.getShape("ROUNDNESS");

        //1.6 执行draw方法
        shapeRoundness.draw();

        //2. 获取颜色工厂
        AbsFactory colorFactory = FactoryProducer.getFactory("COLOR");

        assert colorFactory != null;

        //2.1 获取红色
        Color red = colorFactory.getColor("RED");

        //2.2 填充红色
        red.fill();

        //2.1 获取蓝色
        Color bule = colorFactory.getColor("BULE");

        //2.2 填充蓝色
        bule.fill();

        //2.1 获取原谅色
        Color green = colorFactory.getColor("GREEN");

        //2.2 填充原谅色
        green.fill();
    }
}
