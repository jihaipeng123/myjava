package com.itheima_01;
//abstreact 抽象方法必须存在抽象类中，不需要方法体

public abstract class Animal {

    /*public void eat(){
        System.out.println("动物吃东西");
    }*/
    //抽象方法
    public abstract void eat();

    public void sleep() {
        System.out.println("睡觉");
    }
}

