package com.hairuo.design.patterns.type.create.singleton;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.factory
 * @Date: create in 2022-07-24
 */
public class SingletonDog {
    private static SingletonDog singletonDog = new SingletonDog();
    public static SingletonDog create(){
       return singletonDog;
    }

}
