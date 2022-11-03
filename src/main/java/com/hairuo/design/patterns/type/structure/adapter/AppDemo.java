package com.hairuo.design.patterns.type.structure.adapter;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.adapter
 * @Date: create in 2022-11-03
 */
public class AppDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "武家坡");
        audioPlayer.play("wav", "笨小孩");
        audioPlayer.play("mp4", "东风破");
        audioPlayer.play("mp5", "庐州月");
    }
}
