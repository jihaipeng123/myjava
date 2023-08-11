package com.itheima01;
//String 和 StringBuilder 的转换
public class StringBuilderDemo03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

        //通过toString()实现把 StringBuilder 转换成 String;
        String s  = sb.toString();
        System.out.println(s);

        //String 转换成 StrinBuilder
        String ss = "hello";
        StringBuilder sb2 =new StringBuilder(ss);
        System.out.println(sb2);
    }
}
