package com.hairuo.design.patterns.type.structure.proxy;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.proxy
 * @Date: create in 2022-07-24
 */
public class ProxyHouse implements House{
    private House house = new ConcreteHouse();

    public void foundBuyers(){
        System.out.println("代理找到买家");
    }

    @Override
    public void sell(){
        foundBuyers();
        System.out.println("代理手续办理");
        //关键地方，交易还是房主，手续代理办
        house.sell();
        System.out.println("买家打款给代理");
        System.out.println("代理打款给房主");
        afterSelling();

    }

    public void afterSelling(){
        System.out.println("代理办理过户更手续");
    }
}
