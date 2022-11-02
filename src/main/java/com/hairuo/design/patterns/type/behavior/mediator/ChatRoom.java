package com.hairuo.design.patterns.type.behavior.mediator;

import java.util.Date;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.mediator
 * @Date: create in 2022-11-02
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + "[" + user.getName() + "]:" + message );

    }
}
