package com.ithaima_01;

import javax.lang.model.element.AnnotationMirror;

public class AnimalDemo {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a = new Cat();

        System.out.println(a.age);//输出父类的
        //System.out.println(a.weight);

        a.eat();//输出子类的
        //a.playGame();
    }
}

        /*成员变量：编译看左边（父类），执行看左边
        成员方法：编译看左边，执行看右边（子类）*/
