package com.abs.factory.pattern;

/**
 * Create by yangshunfan
 * 2018/1/20 21:23
 */
public class FactoryProducer {
    public static AbsFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
