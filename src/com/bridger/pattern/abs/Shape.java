package com.bridger.pattern.abs;

import com.bridger.pattern.API.DrawAPI;

/**
 * Create by yangshunfan
 * 2018/1/24 13:40
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
