package com.itheima01;
//创建可变字符串对象

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //创建一个空白可变字符串对象
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb.length():" + sb.length());

        //创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2:" + sb2);
        System.out.println("sb2.length():" + sb2.length());

    }
}
