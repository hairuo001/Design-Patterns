package com.hairuo.design.patterns.type.structure.facade;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.facade
 * @Date: create in 2022-11-03
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw cicle");
    }
}
