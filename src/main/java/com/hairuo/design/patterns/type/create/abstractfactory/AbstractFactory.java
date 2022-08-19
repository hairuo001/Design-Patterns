package com.hairuo.design.patterns.type.create.abstractfactory;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.abstractfactory
 * @Date: create in 2022-08-19
 */
public abstract class AbstractFactory {
    public abstract Animal getAnimal(String animal);

    public abstract Botany getBotnay(String botany);
}
