package com.ithaima_01;
//多态
public class Cat extends Animal{
    public int age = 40;
    public int weight = 10;

    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void playGame(){
        System.out.println("猫捉老鼠");
    }
}
