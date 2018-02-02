package com.visitor.pattern;

import com.visitor.pattern.computer.part.Computer;
import com.visitor.pattern.computer.part.Keyboard;
import com.visitor.pattern.computer.part.Monitor;
import com.visitor.pattern.computer.part.Mouse;

/**
 * Create by yangshunfan
 * 2018/2/2 18:05
 */
public class ComputerPartDisplayVistor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Display keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Display monitor");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Display mouse");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Display computer");
    }
}
