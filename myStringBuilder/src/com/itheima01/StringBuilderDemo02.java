package com.itheima01;
//StringBuilder 的添加与反转

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder();
        //public StringBuilder oppend(任意类型)，添加数据，并返回对象本身
        //StringBuilder sb2 = sb.append("hello");

        /*System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);
        System.out.println(sb == sb2); // 说明sb 和 sb2 同一个对象；*/

        /*sb.append("hello ");
        sb.append("world ");
        sb.append("!");
        System.out.println("sb:" + sb);*/

        //链式编程
        sb.append("hello ").append("world ").append("!");
        System.out.println("sb:" + sb);

        //public StringBuilder reverse() 返回相反的字符序列
        sb.reverse();
        System.out.println("sb:" + sb);
    }
}
