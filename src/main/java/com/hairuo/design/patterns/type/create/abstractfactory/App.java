package com.hairuo.design.patterns.type.create.abstractfactory;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.abstractfactory
 * @Date: create in 2022-08-19
 */
public class App {
    public static void main(String[] args) {
        AnimalFactory factory = (AnimalFactory) CreateFactory.getFactory("animal");
        factory.getAnimal("dog").bite();
        factory.getAnimal("cat").bite();

        BotanyFactory factory2 = (BotanyFactory) CreateFactory.getFactory("botany");
        factory2.getBotnay("tree").name();
        factory2.getBotnay("grass").name();


    }
}
