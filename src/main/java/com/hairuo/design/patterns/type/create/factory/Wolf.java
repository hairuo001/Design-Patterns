package com.hairuo.design.patterns.type.create.factory;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.factory
 * @Date: create in 2022-07-24
 */
public class Wolf implements Monster{
    @Override
    public void run() {
        System.out.println("狼跑了");
    }

    @Override
    public void bite() {
        System.out.println("ou ou ou");
    }
}
