package com.hairuo.design.patterns.type.structure.composite;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.composite
 * @Date: create in 2022-11-03
 */
public class AppDemo {
    public static void main(String[] args) {

        Employee tom = new Employee("Tom");
        Employee john = new Employee("John");

        tom.add(john);

        john.add(tom);

        for (Employee e :
                tom.tree) {
            System.out.println(e.name);
        }
        for (Employee e :
                john.tree) {
            System.out.println(e.name);
        }


    }
}
