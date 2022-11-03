package com.hairuo.design.patterns.type.structure.flyweight;

import java.util.HashMap;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.flyweight
 * @Date: create in 2022-11-03
 */
public class ShapeFactory {
    private static final HashMap<String, Circle> circleHashMap = new HashMap<String, Circle>();

    public Shape getCircle(String color){
        Circle circle = circleHashMap.get(color);
        if(circleHashMap.get(color) == null){
            circle = new Circle(color);
            System.out.println("创建了一个" + color + "圆");
            circleHashMap.put(color, circle);
        }
        return circle;
    }
}
