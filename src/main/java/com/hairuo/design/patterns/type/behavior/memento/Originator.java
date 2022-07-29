package com.hairuo.design.patterns.type.behavior.memento;

public class Originator {
   public String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveMemento(){
        return new Memento(state);
    }

    public void getMemento(Memento memento){
        state = memento.state;
    }
}
