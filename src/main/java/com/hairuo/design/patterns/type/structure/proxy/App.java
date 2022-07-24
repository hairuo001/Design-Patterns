package com.hairuo.design.patterns.type.structure.proxy;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.proxy
 * @Date: create in 2022-07-24
 */
public class App {
    public static void main(String[] args) {
        House house = new ProxyHouse();
        house.sell();


    }
}
