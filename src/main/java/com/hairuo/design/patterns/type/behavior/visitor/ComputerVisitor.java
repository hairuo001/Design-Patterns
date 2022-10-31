package com.hairuo.design.patterns.type.behavior.visitor;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.visitor
 * @Date: create in 2022-09-19
 */
public class ComputerVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("display computer!");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("display mouse!");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("display keyboard!");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("display monitor!");
    }
}
