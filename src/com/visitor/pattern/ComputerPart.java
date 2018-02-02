package com.visitor.pattern;

/**
 * Create by yangshunfan
 * 2018/2/2 17:52
 * 电脑部分
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
