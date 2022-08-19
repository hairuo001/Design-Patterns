package com.hairuo.design.patterns.type.create.prototype;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.prototype
 * @Date: create in 2022-08-19
 */
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();
        Shape shape1 = ShapeCache.getShape("1");
        shape1.draw();

        Shape shape2 = ShapeCache.getShape("1");

        System.out.println(shape1);
        System.out.println(shape2);

        System.out.println(shape1 == shape2);

        Shape shape3 = new Circle();
        Shape shape4 = shape3;

        System.out.println(shape3 == shape4);

    }
}
