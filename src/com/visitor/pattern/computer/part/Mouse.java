package com.visitor.pattern.computer.part;

import com.visitor.pattern.ComputerPart;
import com.visitor.pattern.ComputerPartVisitor;

/**
 * Create by yangshunfan
 * 2018/2/2 18:00
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
