package com.hairuo.design.patterns.type.behavior.command;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.command
 * @Date: create in 2022-11-01
 */
public class StopCar implements Order {
    private Car car;

    public StopCar(Car car) {
        this.car = car;
    }


    @Override
    public void execute() {
        car.stop();
    }
}
