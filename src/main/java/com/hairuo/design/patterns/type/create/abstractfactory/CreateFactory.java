package com.hairuo.design.patterns.type.create.abstractfactory;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.abstractfactory
 * @Date: create in 2022-08-19
 */
public class CreateFactory {
    public static AbstractFactory getFactory(String factory){
        if(factory.equals("animal")){
            return new AnimalFactory();
        }else if(factory.equals("botany")){
            return new BotanyFactory();
        }else {
            return  null;
        }
    }
}
