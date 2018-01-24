package com.bridger.pattern.impl;

import com.bridger.pattern.API.DrawAPI;

/**
 * Create by yangshunfan
 * 2018/1/24 13:37
 */
public class RedCricle implements DrawAPI {
    @Override
    public void drawCricle(int radius, int x, int y) {
        System.out.println("Red cricle,radius:" + radius + ",x:" + x + ",y:" + y);
    }
}
