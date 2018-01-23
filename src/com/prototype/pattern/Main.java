package com.prototype.pattern;

import com.prototype.pattern.dao.ShapeCeche;

/**
 * Create by yangshunfan
 * 2018/1/23 15:29
 */
public class Main {
    public static void main(String[] args) {
        ShapeCeche.loadCehe();
        Shape cloneShape1 = ShapeCeche.getShape("1");
        System.out.println("Shape1:" + cloneShape1.getType());

        Shape cloneShape2 = ShapeCeche.getShape("2");
        System.out.println("Shape2:" + cloneShape2.getType());

        Shape cloneShape3 = ShapeCeche.getShape("3");
        System.out.println("Shape3:" + cloneShape3.getType());
    }
}
