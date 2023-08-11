package com.itheima_04;

public class PingpangCoach extends Coach implements SpeakEnglish{
    public PingpangCoach() {
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教如何发球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃鱼肉");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
