package com.abs.factory.pattern;

/**
 * Create by yangshunfan
 * 2018/1/20 21:10
 */
public abstract class AbsFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
