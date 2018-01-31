package com.proxy.pattern;

/**
 * Create by yangshunfan
 * 2018/1/31 13:17
 */
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("冰岛.jpg");

        //将图像从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}
