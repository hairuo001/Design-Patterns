package com.hairuo.design.patterns.type.structure.flyweight;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.flyweight
 * @Date: create in 2022-11-03
 */
public class Circle implements Shape{
    public Circle(String color) {
    }

    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
