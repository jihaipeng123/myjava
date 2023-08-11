package com.itheima_05;

public class JumppingDemo {
    public static void main(String[] args) {
        Jumpping jo = new Jumpping();
        JumppingInter j = new Cat();
        jo.method(j);
        System.out.println("--------");
        //匿名内部类
        jo.method(new JumppingInter() {
            @Override
            public void jump() {
                System.out.println("猫调高");
            }
        });
    }
}
