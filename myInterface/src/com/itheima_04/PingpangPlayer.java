package com.itheima_04;

public class PingpangPlayer extends Player implements SpeakEnglish{
    public PingpangPlayer() {
    }

    public PingpangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("乒乓球运动员吃素菜");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员学发球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
