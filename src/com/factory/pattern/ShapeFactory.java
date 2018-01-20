package com.factory.pattern;

/**
 * Create by yangshunfan
 * 2018/1/20 20:51
 *
 * 工厂
 */
public class ShapeFactory {
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if(shape.equalsIgnoreCase("ROUNDNESS")){
            return new Roundness();
        } else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
