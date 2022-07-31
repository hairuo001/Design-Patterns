package com.hairuo.design.patterns.type.create.biuilder;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.biuilder
 * @Date: create in 2022-07-31
 */
public class App {
    public static void main(String[] args) {
        LaptopBuilder laptopBuilder = new LaptopBuilder();
        Builder laptopBuilder1 = new Director(laptopBuilder).construct(1000L, 10000L,200000L);
        System.out.println(laptopBuilder1.toString());

        DesktopBuilder desktopBuilder = new DesktopBuilder();
        Builder deskBuilder1 = new Director(desktopBuilder).construct(100000L, 1000000L,20000000L);
        System.out.println(deskBuilder1.toString());
    }
}
