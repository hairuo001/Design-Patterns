package com.hairuo.design.patterns.type.structure.adapter;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.adapter
 * @Date: create in 2022-11-03
 */
public class Mp4MediaPlayer implements AdvancedMediaPlayer{
    @Override
    public void palyMp4(String fileName) {
        System.out.println("Playing：" + fileName );
    }

    @Override
    public void palyWAV(String fileName) {
        System.out.println("I am Mp4MediaPlayer!");
    }
}
