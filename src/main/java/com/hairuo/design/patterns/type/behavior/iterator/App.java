package com.hairuo.design.patterns.type.behavior.iterator;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.iterator
 * @Date: create in 2022-10-31
 */
public class App {
    public static void main(String[] args) {
        HeroRepository heroRepository = new HeroRepository();

        for (Iteraror iteraror = heroRepository.getIterator(); heroRepository.getIterator().hasNext();) {
            String hero = (String) iteraror.next();
            System.out.println("Hero: " + hero);
        }
    }
}
