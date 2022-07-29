package com.hairuo.design.patterns.type.behavior.memento;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class App {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("进入");
        careTaker.addMemento(originator.saveMemento());
        originator.setState("打怪");
        careTaker.addMemento(originator.saveMemento());
        originator.setState("离开");
        careTaker.addMemento(originator.saveMemento());

        careTaker.arrayList.forEach(memento -> System.out.println(memento.getState()));

        System.out.println("当前状态：" + originator.state);


        //切换状态
        originator.setState(careTaker.arrayList.get(1).state);

        System.out.println("当前状态：" + originator.state);



    }
}
