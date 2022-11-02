package com.hairuo.design.patterns.type.behavior.state;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.state
 * @Date: create in 2022-11-02
 */
public class HappyState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("I am happy!");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "HappyState{}";
    }
}
