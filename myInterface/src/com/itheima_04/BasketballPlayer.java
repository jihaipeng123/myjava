package com.itheima_04;

public class BasketballPlayer extends Player{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("蓝球运动员吃牛肉");
    }

    @Override
    public void learn() {
        System.out.println("篮球用动员学投球");
    }
}
