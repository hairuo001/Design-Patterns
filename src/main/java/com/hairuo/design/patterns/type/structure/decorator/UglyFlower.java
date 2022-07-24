package com.hairuo.design.patterns.type.structure.decorator;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.decorator
 * @Date: create in 2022-07-24
 */
public class UglyFlower implements Flower{
    @Override
    public void looked() {
        System.out.println("Ugly");
    }
}
