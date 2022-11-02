package com.hairuo.design.patterns.type.behavior.state;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.state
 * @Date: create in 2022-11-02
 */
public class AppDemo {
    public static void main(String[] args) {
        Context context = new Context(null);

        State state = new HappyState();
        state.doAction(context);

        System.out.println(context.getState());

    }
}
