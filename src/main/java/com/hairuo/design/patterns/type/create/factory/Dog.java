package com.hairuo.design.patterns.type.create.factory;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.factory
 * @Date: create in 2022-07-24
 */
public class Dog implements Monster{
    @Override
    public void run() {
        System.out.println("狗跑了");
    }

    @Override
    public void bite() {
        System.out.println("汪汪汪");
    }
}
