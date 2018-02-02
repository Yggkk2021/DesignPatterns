package com.visitor.pattern;

import com.visitor.pattern.computer.part.Computer;

/**
 * Create by yangshunfan
 * 2018/2/2 18:06
 * 访问者模式
 */
public class Main {
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVistor());
    }
}
