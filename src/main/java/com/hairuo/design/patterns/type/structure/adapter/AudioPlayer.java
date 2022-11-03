package com.hairuo.design.patterns.type.structure.adapter;

/**
 * @Author: create by Tuo.Li
 * @Description: com.hairuo.design.patterns.type.structure.adapter
 * @Date: create in 2022-11-03
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing:" + fileName);
        }else if(audioType.equalsIgnoreCase("mp4")
                || audioType.equalsIgnoreCase("wav")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("Audio type not support!");
        }

    }
}
