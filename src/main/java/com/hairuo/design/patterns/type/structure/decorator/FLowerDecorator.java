package com.hairuo.design.patterns.type.structure.decorator;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.decorator
 * @Date: create in 2022-07-24
 */
public class FLowerDecorator implements Flower{
    private Flower flower;

    public FLowerDecorator(Flower flower) {
        this.flower = flower;
    }

    @Override
    public void looked() {
        flower.looked();
        System.out.println("修饰一下花");
        System.out.println("花变漂亮了");
    }
}
