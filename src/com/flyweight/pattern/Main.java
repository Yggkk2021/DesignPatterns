package com.flyweight.pattern;


/**
 * Create by yangshunfan
 * 2018/1/26 15:51
 */
public class Main {
    private static final String colors[] = {"Red","Blue","Forgive","Yellow"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getColor(colors));
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(getRadius());
            circle.draw();
        }
    }

    private static String getColor(String colors[]) {
        return colors[(int) (Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
    private static int getRadius() {
        int radius = (int) (Math.random()*10);
        return radius>0? radius : getRadius();
    }
}
