package com.hairuo.design.patterns.type.create.abstractfactory;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.abstractfactory
 * @Date: create in 2022-08-19
 */
public class BotanyFactory extends AbstractFactory {
    @Override
    public Animal getAnimal(String animal) {
        return null;

    }

    @Override
    public Botany getBotnay(String botany) {

        if(botany.equals("grass")){
            return new Grass();
        }else if(botany.equals("tree")){
            return new Tree();
        }else {
            return null;
        }
    }
}
