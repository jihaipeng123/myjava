package com.itheima_02;

public class FinalDemo {

    public static void main(String[] args) {

        //final修饰基本变量类型，内容不变
        final int age = 40;

        //final修饰引用类型变量
        final Student s = new Student();
        //s的地址不会变，内容可变
        s.age = 100;
        System.out.println(s.age);
    }
}
