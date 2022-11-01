package com.hairuo.design.patterns.type.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.command
 * @Date: create in 2022-11-01
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    public void exeOrders(){
        for (Order order :
                orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
