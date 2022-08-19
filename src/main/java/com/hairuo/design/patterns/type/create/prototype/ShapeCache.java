package com.hairuo.design.patterns.type.create.prototype;

import java.util.HashMap;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.prototype
 * @Date: create in 2022-08-19
 */
public class ShapeCache {
   public static HashMap<String, Object> hashMap = new HashMap();
    public static void loadCache(){
        Shape circle = new Circle();
        circle.setId("1");
        hashMap.put("1", circle);

        Shape rectangle = new Rectangle();
        rectangle.setId("2");
        hashMap.put("2", rectangle);

        Shape traingle = new Traingle();
        traingle.setId("3");
        hashMap.put("3", traingle);

    }

    public static Shape getShape(String id ) throws CloneNotSupportedException {
        Shape shape = (Shape) hashMap.get(id);
        return (Shape) shape.clone();
    }
}
