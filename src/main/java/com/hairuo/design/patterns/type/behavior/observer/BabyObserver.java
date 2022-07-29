package com.hairuo.design.patterns.type.behavior.observer;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.observer
 * @Date: create in 2022-07-29
 */
public class BabyObserver extends Observer{
    public BabyObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        this.state = subject.getState();
        System.out.println("BabyObserver:" + this.state);
    }
}
