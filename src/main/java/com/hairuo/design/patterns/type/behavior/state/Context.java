package com.hairuo.design.patterns.type.behavior.state;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.state
 * @Date: create in 2022-11-02
 */
public class Context {
    private State state;



    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
