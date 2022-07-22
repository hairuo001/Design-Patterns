package com.hairuo.design.patterns.type.behavior.strategy;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.behavior.strategy
 * @Date: create in 2022-07-22
 */
public class PlayContext{
    private Play play;

    public PlayContext(Play play) {
        this.play = play;
    }

    public void playing(){
        System.out.println("Do soming before playing!");
        play.playing();
        System.out.println("Do soming after playing");
    }
}
