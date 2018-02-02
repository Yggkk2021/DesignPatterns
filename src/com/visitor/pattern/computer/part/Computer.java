package com.visitor.pattern.computer.part;

import com.visitor.pattern.ComputerPart;
import com.visitor.pattern.ComputerPartVisitor;

/**
 * Create by yangshunfan
 * 2018/2/2 18:01
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Mouse(),new Keyboard(),new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
