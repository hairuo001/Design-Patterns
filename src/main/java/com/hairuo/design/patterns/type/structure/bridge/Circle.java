package com.hairuo.design.patterns.type.structure.bridge;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.bridge
 * @Date: create in 2022-11-03
 */
public class Circle extends Shape{
    private int x, y, redis;

    public Circle(DrawAPI drawAPI, int x, int y, int redis) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.redis = redis;
    }

    @Override
    public void draw() {
        drawAPI.DrawCircle(redis, x, y);
    }
}
