package com.decorator.pattern;

import com.decorator.pattern.Model.Rectangle;
import com.decorator.pattern.Model.Roundness;
import com.decorator.pattern.Model.Square;
import com.decorator.pattern.service.Shape;

/**
 * Create by yangshunfan
 * 2018/1/26 14:41
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();

        Shape roundness = new Roundness();

        Shape square = new Square();
        /**
         * 长方形
         */
        System.out.println("长方形");
        rectangle.draw();
        /**
         * 圆形
         */
        System.out.println("圆形");
        roundness.draw();
        /**
         * 正方形
         */
        System.out.println("正方形");
        square.draw();
    }
}
