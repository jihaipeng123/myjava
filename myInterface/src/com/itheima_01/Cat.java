package com.itheima_01;

public class Cat  extends Object implements Jumpping{
    public Cat() {
        super();
    }

    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }

    @Override
    public void show() {

    }
}
