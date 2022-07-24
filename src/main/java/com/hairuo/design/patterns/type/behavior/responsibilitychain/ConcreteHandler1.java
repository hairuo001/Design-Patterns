package com.hairuo.design.patterns.type.behavior.responsibilitychain;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.responsibilitychain
 * @Date: create in 2022-07-24
 */
public class ConcreteHandler1 extends Handler{
    @Override
    public void handler(int type) {
        if(this.type == type){
            System.out.println("ConcreteHandler1 is running!");
        }else {
            this.next.handler(type);
        }
    }
}
