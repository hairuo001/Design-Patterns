package com.hairuo.design.patterns.type.structure.bridge;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.bridge
 * @Date: create in 2022-11-03
 */
public class RedCircle implements DrawAPI{
    @Override
    public void DrawCircle(int redis, int x, int y) {
        System.out.println("red circle:" + "redis " + redis + ",x " + x + ",y " + y );

    }
}
