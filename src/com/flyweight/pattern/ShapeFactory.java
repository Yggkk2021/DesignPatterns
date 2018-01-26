package com.flyweight.pattern;

import java.util.HashMap;

/**
 * Create by yangshunfan
 * 2018/1/26 15:45
 */
public class ShapeFactory {
    private static final HashMap<String,Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = new Circle(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Craete new" + color + "circle");
        }
        return  circle;
    }
}
