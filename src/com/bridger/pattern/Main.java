package com.bridger.pattern;

import com.bridger.pattern.abs.Cricle;
import com.bridger.pattern.abs.Shape;
import com.bridger.pattern.impl.BlueCricle;
import com.bridger.pattern.impl.RedCricle;

/**
 * Create by yangshunfan
 * 2018/1/24 13:45
 */
public class Main {
    public static void main(String[] args) {
        Shape redShape = new Cricle(10,10,3,new RedCricle());
        Shape blueShape = new Cricle(20,20,7,new BlueCricle());

        redShape.draw();
        blueShape.draw();
    }
}
