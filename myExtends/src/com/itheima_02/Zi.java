package com.itheima_02;

public class Zi extends Fu{

    public Zi(){
        //super();
        System.out.println("Zi中无参构造方法被调用");
    }

    public Zi(int age){
        super(20);
        System.out.println("Zi中带参构造方法被调用");
    }
}
