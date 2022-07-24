package com.hairuo.design.patterns.type.structure.proxy;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.proxy
 * @Date: create in 2022-07-24
 */
public class ConcreteHouse implements House{
    private static String master = "hairuo";
    @Override
    public void sell() {
        System.out.println("房主" + master + "卖掉房子");
    }
}
