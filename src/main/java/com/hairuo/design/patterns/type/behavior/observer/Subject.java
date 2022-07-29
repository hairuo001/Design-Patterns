package com.hairuo.design.patterns.type.behavior.observer;

import java.util.ArrayList;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.observer
 * @Date: create in 2022-07-29
 */
public class Subject {
    public ArrayList<Observer> observersList = new ArrayList<Observer>();
    public String state;

    public void setState(String state) {
        this.state = state;
        this.notifyAllObservers();
    }

    public String getState() {
        return state;
    }

    public void addObserver(Observer observer) {
        observersList.add(observer);
    }

    public void deleteObserver(Observer observer){
        observersList.remove(observer);
    }

    public void notifyAllObservers(){
        observersList.forEach(observer ->
                observer.update()
                );
    }

}
