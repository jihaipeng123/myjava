package com.itheima_01;

public class Zi extends Fu{

    public int age = 20;

    public void show(){
        int age = 30;

        //我要访问show函数的age;
        System.out.println(age);

        //我要访问本类的成员变量age;
        System.out.println(this.age);

        //我要访问父类的成员变量age;
        System.out.println(super.age);

    }
}
