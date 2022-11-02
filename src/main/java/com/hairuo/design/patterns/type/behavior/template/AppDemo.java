package com.hairuo.design.patterns.type.behavior.template;

import java.lang.annotation.Target;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.template
 * @Date: create in 2022-11-02
 */
public class AppDemo {
    public static void main(String[] args) {
        Travel travel1 = new DomesticTraveling();
        Travel travel2 = new AbroadTraveling();

        travel1.travel();
        travel2.travel();
    }
}
