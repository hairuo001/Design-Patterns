package com.hairuo.design.patterns.type.create.abstractfactory;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.abstractfactory
 * @Date: create in 2022-08-19
 */
public class AnimalFactory extends AbstractFactory {
    @Override
    public Animal getAnimal(String animal) {
        if(animal.equals("cat")){
            return new Cat();
        }else if(animal.equals("dog")){
            return new Dog();
        }else {
            return null;
        }

    }

    @Override
    public Botany getBotnay(String botany) {
        return null;
    }
}
