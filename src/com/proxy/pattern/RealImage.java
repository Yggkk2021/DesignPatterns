package com.proxy.pattern;

/**
 * Create by yangshunfan
 * 2018/1/31 13:13
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("FileName:" + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading:" + fileName);
    }
}
