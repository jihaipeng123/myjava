package com.itheima01;
//StringBuilder 的反转
import java.util.Scanner;

public class StringBuilderDome05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        s = myReverse(s);
        System.out.println("s:" + s);
    }

    public static String myReverse(String s){
        //用StringBuilder
        /*StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();
        return s1;*/
        return new StringBuilder(s).reverse().toString(); //链式
    }
}
