package com.hairuo.design.patterns.type.structure.adapter;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.adapter
 * @Date: create in 2022-11-03
 */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4MediaPlayer();
        } else if (audioType.equalsIgnoreCase("wav")) {
            advancedMediaPlayer = new WavMediaPlayer();

        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.palyMp4(fileName);
        } else if (audioType.equalsIgnoreCase("wav")) {
            advancedMediaPlayer.palyWAV(fileName);
        }
    }
}
