package com.visitor.pattern.computer.part;

import com.visitor.pattern.ComputerPart;
import com.visitor.pattern.ComputerPartVisitor;

/**
 * Create by yangshunfan
 * 2018/2/2 17:54
 * 键盘类
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
