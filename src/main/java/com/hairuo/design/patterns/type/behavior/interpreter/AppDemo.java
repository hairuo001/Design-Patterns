package com.hairuo.design.patterns.type.behavior.interpreter;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.interpreter
 * @Date: create in 2022-11-02
 */
public class AppDemo {
    //规则一
    public static Expression getMarriedWomenExpression(){
        Expression married = new TerminalExpression("married");
        Expression sex = new TerminalExpression("women");

        return new AndExpression(married, sex);
    }
    public static void main(String[] args) {
        System.out.println(getMarriedWomenExpression().interpret("married women"));
    }
}
