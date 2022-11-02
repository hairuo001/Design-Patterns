package com.hairuo.design.patterns.type.behavior.mediator;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.mediator
 * @Date: create in 2022-11-02
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);

    }
}
