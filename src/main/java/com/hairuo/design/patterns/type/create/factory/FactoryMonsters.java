package com.hairuo.design.patterns.type.create.factory;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.create.factory
 * @Date: create in 2022-07-24
 */
public class FactoryMonsters {
    public static Monster createMonster(String monsterName){
        if(monsterName.equals("Wolf")){
            return new Wolf();
        } else if (monsterName.equals("Cat")) {
            return new Cat();
        }else if(monsterName.equals("Dog")){
            return new Dog();
        }else {
            System.out.println("NO Monster named " + monsterName);
        return null;
        }
    }
}
