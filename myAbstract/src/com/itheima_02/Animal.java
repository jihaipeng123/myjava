package com.itheima_02;

public abstract class Animal {
    private int age = 30;
    private final String city = "冰晶";//city是常量

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public void show(){
        age = 40;
        //city = "上海";
        System.out.println(age);
        System.out.println(city);
    }

    public abstract void eat();

}
