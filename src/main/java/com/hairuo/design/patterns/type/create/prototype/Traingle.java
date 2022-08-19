package com.hairuo.design.patterns.type.create.prototype;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.prototype
 * @Date: create in 2022-08-19
 */
public class Traingle extends Shape{
    @Override
    void draw() {
        System.out.println("画一个三角形");
    }

    public Traingle() {
        type = "三角形";
    }
}
