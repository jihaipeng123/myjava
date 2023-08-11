package com.ithaima_03;

public class AnimalDemo {
    public static void main(String[] args) {
        //父类引用指向子类对象 向上转型
        Animal a = new Cat();
        a.eat();

        //a.playGame();
        /*//创建Cat类对象
        Cat c = new Cat();
        c.eat();
        c.playGame();*/

        //向下转型
        Cat c = (Cat)a;
        c.eat();
        c.playGame();


    }
}
