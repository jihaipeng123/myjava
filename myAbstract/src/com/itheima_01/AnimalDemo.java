package com.itheima_01;

public class AnimalDemo {
    public static void main(String[] args) {
        /*抽象类不是具体的，不能创建对象
        Animal a = new Animal();*/

        //抽象类创建对象参照多态
        Animal a = new Cat();
        a.eat();
        a.sleep();
    }
}
