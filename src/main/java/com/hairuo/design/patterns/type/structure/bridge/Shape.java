package com.hairuo.design.patterns.type.structure.bridge;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.bridge
 * @Date: create in 2022-11-03
 */
public abstract class Shape {
    public DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();


}
