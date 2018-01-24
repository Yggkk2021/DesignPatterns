package com.bridger.pattern.abs;

import com.bridger.pattern.API.DrawAPI;

/**
 * Create by yangshunfan
 * 2018/1/24 13:43
 */
public class Cricle extends Shape {

    private int x,y,radius;

    public Cricle(int x,int y,int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCricle(radius,x,y);
    }
}
