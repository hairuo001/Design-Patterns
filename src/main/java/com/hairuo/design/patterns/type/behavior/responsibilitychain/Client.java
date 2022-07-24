package com.hairuo.design.patterns.type.behavior.responsibilitychain;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.responsibilitychain
 * @Date: create in 2022-07-24
 */
public class Client {
    private Handler registResponsibilityChain(){
        Handler handler = new ConcreteHandler1();
        handler.type = 1 ;
        handler.setNext(new ConcreteHandler3());
        handler.next.type = 3;
        return handler;
    }

    public static void main(String[] args) {
        Handler handler = new Client().registResponsibilityChain();
        handler.handler(3);
    }
}
