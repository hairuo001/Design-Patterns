package com.hairuo.design.patterns.type.create.factory;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.factory
 * @Date: create in 2022-07-24
 */
public class App {
    public static void main(String[] args) {
        Monster dog = FactoryMonsters.createMonster("Dog");
        Monster cat = FactoryMonsters.createMonster("Cat");
        Monster wolf = FactoryMonsters.createMonster("Wolf");
        dog.bite();
        cat.run();
        dog.run();
        cat.bite();
        wolf.run();
        wolf.bite();


    }
}
