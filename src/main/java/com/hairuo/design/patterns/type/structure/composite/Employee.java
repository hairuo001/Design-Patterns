package com.hairuo.design.patterns.type.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.composite
 * @Date: create in 2022-11-03
 */
public class Employee {
    public String name;

    public List<Employee> tree;

    public Employee(String name) {
        this.name = name;
        this.tree = new ArrayList<Employee>();
    }

    public void add(Employee employee){
        tree.add(employee);

    }
}
