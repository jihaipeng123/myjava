package com.itheima_01;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("-------------");

        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.56));
        System.out.println("-------------");

        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.56));
        System.out.println("-------------");

        //按照四舍五入返回最接近参数的int
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.56));
        System.out.println("-------------");

        System.out.println(Math.max(66,88));
        System.out.println(Math.min(66,88));
        System.out.println("-------------");

        System.out.println(Math.pow(2.0,3.0));
        System.out.println("-------------");

        //返回值为double的正值，[0.0,1.0);//[1,100]
        System.out.println((int)(Math.random()*100)+1);
        System.out.println("-------------");
    }
}
