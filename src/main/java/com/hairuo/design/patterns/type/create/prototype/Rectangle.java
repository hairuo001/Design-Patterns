package com.hairuo.design.patterns.type.create.prototype;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.prototype
 * @Date: create in 2022-08-19
 */
public class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("画一个矩形");
    }

    public Rectangle() {
        type = "矩形";
    }
}
