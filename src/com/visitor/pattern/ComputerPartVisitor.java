package com.visitor.pattern;

import com.visitor.pattern.computer.part.Computer;
import com.visitor.pattern.computer.part.Keyboard;
import com.visitor.pattern.computer.part.Monitor;
import com.visitor.pattern.computer.part.Mouse; /**
 * Create by yangshunfan
 * 2018/2/2 17:53
 */
public interface ComputerPartVisitor {

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);

    public void visit(Mouse mouse);

    public void visit(Computer computer);
}
