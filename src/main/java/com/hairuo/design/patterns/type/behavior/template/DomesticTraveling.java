package com.hairuo.design.patterns.type.behavior.template;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.template
 * @Date: create in 2022-11-02
 */
public class DomesticTraveling extends Travel {
    @Override
    void plan() {
        System.out.println("1.计划国内旅游");
    }

    @Override
    void go() {
        System.out.println("2.出发去国内旅游");
    }

    @Override
    void back() {
        System.out.println("3.国内旅游结束回家");
    }
}
