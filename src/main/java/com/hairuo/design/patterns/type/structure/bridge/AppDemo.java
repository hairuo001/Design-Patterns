package com.hairuo.design.patterns.type.structure.bridge;

import com.hairuo.design.patterns.type.create.prototype.Shape;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.bridge
 * @Date: create in 2022-11-03
 */
public class AppDemo {
    public static void main(String[] args) {
        Circle redCircle = new Circle(new RedCircle(), 1, 2, 100);

        redCircle.draw();
    }
}
