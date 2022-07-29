package com.hairuo.design.patterns.type.behavior.memento;

import java.util.ArrayList;

public class CareTaker {
    public ArrayList<Memento> arrayList = new ArrayList<>();

    public void addMemento(Memento memento){
        arrayList.add(memento);
    }

    public Memento getMemento(int indexOfMemnto){
        return arrayList.get(indexOfMemnto);
    }
}
