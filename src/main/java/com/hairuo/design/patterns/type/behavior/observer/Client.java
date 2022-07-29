package com.hairuo.design.patterns.type.behavior.observer;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.observer
 * @Date: create in 2022-07-29
 */
public class Client {


    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new BabyObserver(subject);
        Observer observer2 = new ManObserver(subject);
        Observer observer3 = new DogObserver(subject);
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        observer1.subject.setState("小孩来过！");
        observer2.subject.setState("大人来过！");
        observer3.subject.setState("狗来过！");


    }

}
