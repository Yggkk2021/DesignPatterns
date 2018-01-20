package com.abs.factory.pattern;


/**
 * Create by yangshunfan
 * 2018/1/20 21:11
 */
public class ShapeFactory extends AbsFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
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
