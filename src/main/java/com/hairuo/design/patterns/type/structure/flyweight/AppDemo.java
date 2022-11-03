package com.hairuo.design.patterns.type.structure.flyweight;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.flyweight
 * @Date: create in 2022-11-03
 */
public class AppDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getCircle("blue");
        shapeFactory.getCircle("blue");
        shapeFactory.getCircle("red");

    }
}
