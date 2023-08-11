package com.itheima_03;

public class Outer {
    private int num = 10;

    public void method(){
        //局部内部类
        class Inner{
            int num2 = 20;
            public void show(){
                System.out.println(num);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
