package com.hairuo.design.patterns.type.behavior.command;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.command
 * @Date: create in 2022-11-01
 */
public class RunCar implements Order{
    private Car car;
    public RunCar(Car car){
        this.car = car;
    }

    @Override
    public void execute() {
        car.run();
    }
}
