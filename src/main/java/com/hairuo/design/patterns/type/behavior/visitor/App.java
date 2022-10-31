package com.hairuo.design.patterns.type.behavior.visitor;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.visitor
 * @Date: create in 2022-09-19
 */
public class App {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerVisitor());
    }
}
