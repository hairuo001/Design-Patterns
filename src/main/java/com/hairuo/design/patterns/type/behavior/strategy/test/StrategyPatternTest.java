package com.hairuo.design.patterns.type.behavior.strategy.test;

import com.hairuo.design.patterns.type.behavior.strategy.Play;
import com.hairuo.design.patterns.type.behavior.strategy.PlayBasketball;
import com.hairuo.design.patterns.type.behavior.strategy.PlayContext;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.strategy.test
 * @Date: create in 2022-07-22
 */
public class StrategyPatternTest{
    public static void main(String[] args) {
        Play play = new PlayBasketball();
        PlayContext context = new PlayContext(play);
        context.playing();
    }
}
