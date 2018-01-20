package com.abs.factory.pattern;

/**
 * Create by yangshunfan
 * 2018/1/20 21:19
 */
public class ColorFactory extends AbsFactory {
    @Override
    Color getColor(String color) {
        if (color==null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("BULE")) {
            return new Bule();
        } else if (color.equalsIgnoreCase("Green")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
