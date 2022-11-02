package com.hairuo.design.patterns.type.behavior.mediator;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.mediator
 * @Date: create in 2022-11-02
 */
public class AppDemo {
    public static void main(String[] args) {
        User liuBei = new User("刘备");
        User caoCao = new User("曹操");
        User sunQuan = new User("孙权");

        liuBei.sendMessage("我是刘备");
        caoCao.sendMessage("我是曹操");
        sunQuan.sendMessage("我是孙权");

    }
}
