package com.itheima_03;

public class AnimalDemoi {
    public static void main(String[] args) {
        //创建对象
        Animal a =new Cat();
        a.setName("波比");
        a.setAge(5);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();

        a = new Cat("加菲", 5);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();

    }
}
