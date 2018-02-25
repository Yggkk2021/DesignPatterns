package com.abs.factory.pattern;

import com.abs.factory.pattern.model.color.Color;
import com.abs.factory.pattern.model.color.shape.Shape;

/**
 * Create by yangshunfan
 * 2018/1/20 21:10
 */
public abstract class AbsFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
