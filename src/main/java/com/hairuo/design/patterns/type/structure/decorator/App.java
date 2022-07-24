package com.hairuo.design.patterns.type.structure.decorator;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.decorator
 * @Date: create in 2022-07-24
 */
public class App {
    public static void main(String[] args) {
        /**区别于代理模式，装饰者模式需要向用户暴露被装饰的对象。代理和真实对象之
         间的的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造。*/
        Flower flower = new FLowerDecorator(new UglyFlower());
        flower.looked();
    }
}
