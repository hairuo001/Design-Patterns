package com.hairuo.design.patterns.type.behavior.command;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.command
 * @Date: create in 2022-11-01
 */
public class App {

    public static void main(String[] args) {
        Car car = new Car();
        RunCar runCar = new RunCar(car);
        StopCar stopCar = new StopCar(car);

        Broker broker = new Broker();
        broker.addOrder(runCar);
        broker.addOrder(runCar);
        broker.addOrder(stopCar);
        broker.addOrder(stopCar);

        broker.exeOrders();

    }


}
