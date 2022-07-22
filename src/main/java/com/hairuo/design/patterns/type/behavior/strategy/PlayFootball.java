package com.hairuo.design.patterns.type.behavior.strategy;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.strategy
 * @Date: create in 2022-07-22
 */
public class PlayFootball implements Play{
    @Override
    public void playing(){
        System.out.println("Playing football!");
    }
}
