package com.hairuo.design.patterns.type.create.abstractfactory;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.abstractfactory
 * @Date: create in 2022-08-19
 */
public class Cat implements Animal{
    @Override
    public void bite() {
        System.out.println("喵喵喵！");
    }
}
