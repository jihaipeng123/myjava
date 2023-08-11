package com.itheima_02;

public class Cat extends Animal implements Jumpping{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("猫会跳高了");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
