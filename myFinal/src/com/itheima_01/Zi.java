package com.itheima_01;

public class Zi extends Fu{
    //修饰变量时为常量
    public final int age = 20;
    public void show(){
    //    age = 100;
        System.out.println(age);
    }

    @Override
    public  void method(){
        System.out.println("Zi method");
    }
    /*被 final 修饰为最终，不能被重写
    public final void method(){
        System.out.println("Fu method");
    }*/
}
