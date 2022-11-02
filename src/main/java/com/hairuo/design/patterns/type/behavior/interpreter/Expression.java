package com.hairuo.design.patterns.type.behavior.interpreter;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.interpreter
 * @Date: create in 2022-11-02
 */
public interface Expression {

    public boolean interpret(String context);
}
