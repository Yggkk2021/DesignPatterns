package com.command.pattern;

/**
 * Create by yangshunfan
 * 2018/2/1 12:43
 * 请求类
 */
public class Stock {
    private String name = "ysf";
    private int quantity = 1;

    public void buy() {
        System.out.println("Name:" + name + ",Quantity:" + quantity + "bought");
    }
    public void sell() {
        System.out.println("Stock:[Name:" + name + ",Quantity:" + quantity + "] sold");
    }
}
