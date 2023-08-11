package com.itheima_01;
/*
    测试类（接口）
* */
public class JumppingDemo {
    public static void main(String[] args) {
       // Jumpping j = new Jumpping();接口也是抽象的
        Jumpping j = new Cat();

        //j.num = 20; 接口中变量默认为final
        System.out.println(j.num+", "+j.num2);

        //通过接口名直接访问
        System.out.println(Jumpping.num);
        j.jump();
    }
}
