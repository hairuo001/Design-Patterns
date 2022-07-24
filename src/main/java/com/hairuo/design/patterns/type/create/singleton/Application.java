package com.hairuo.design.patterns.type.create.singleton;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.factory
 * @Date: create in 2022-07-24
 */
public class Application {
    public static void main(String[] args) {
        SingletonDog singletonDog = SingletonDog.create();
        SingletonDog singletonDog2 = SingletonDog.create();
        if(singletonDog2 == singletonDog){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
