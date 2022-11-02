package com.hairuo.design.patterns.type.behavior.template;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.template
 * @Date: create in 2022-11-02
 */
public abstract class Travel {
    abstract void plan();
    abstract void go();
    abstract void back();

    public final void travel(){
        plan();
        go();
        back();

    }
}
