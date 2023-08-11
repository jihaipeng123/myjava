package com.itheima_01;

public class Outer {

    private int num = 10;

    //内部类
    public class Inner{
        //内部类可以直接访问外部类的成员，包括私有
        public void show(){
            System.out.println(num);
        }
    }

    //外部类要访问内部类的成员，必须创建对象
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
