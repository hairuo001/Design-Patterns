package com.hairuo.design.patterns.type.behavior.command;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.command
 * @Date: create in 2022-11-01
 */
public class Car {
    private String name = "BMW";
    public void run(){
        System.out.println(name + "running!");
    }

    public void stop(){
        System.out.println(name + "stop!");
    }
}
