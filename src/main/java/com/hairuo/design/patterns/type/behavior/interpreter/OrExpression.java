package com.hairuo.design.patterns.type.behavior.interpreter;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.interpreter
 * @Date: create in 2022-11-02
 */
public class OrExpression implements Expression{

    private Expression exp1 = null;

    public OrExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    private Expression exp2 = null;

    @Override
    public boolean interpret(String context) {

        return exp1.interpret(context) || exp2.interpret(context);

    }
}
