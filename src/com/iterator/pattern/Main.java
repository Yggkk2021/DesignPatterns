package com.iterator.pattern;

/**
 * Create by yangshunfan
 * 2018/2/1 13:46
 * 迭代器模式
 */
public class Main {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator();iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println("Names:" + name);
        }
    }
}
