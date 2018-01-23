package com.prototype.pattern.dao;

import com.prototype.pattern.Shape;
import com.prototype.pattern.ext.Rectangle;
import com.prototype.pattern.ext.Roundness;
import com.prototype.pattern.ext.Square;

import java.util.Hashtable;

/**
 * Create by yangshunfan
 * 2018/1/23 15:18
 * 从数据库取出实体类，将他们存放在一个Hashtable中
 */
public class ShapeCeche {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();

    public static Shape getShape(String shapeID) {
        Shape shapeCeche = shapeMap.get(shapeID);
        return (Shape) shapeCeche.clone();
    }

    /**
     * 对每种形状都运行数据库查询，并建立该形状
     * 例如我们要添加三种形状
     */
    public static void loadCehe() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(rectangle.getId(),rectangle);

        Roundness roundness = new Roundness();
        roundness.setId("2");
        shapeMap.put(roundness.getId(),roundness);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(),square);
    }
}
