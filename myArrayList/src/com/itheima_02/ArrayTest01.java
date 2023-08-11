package com.itheima_02;
//创建一个存储字符串的集合，存储3个字符串元素，使用程序实现控制台遍历该集合

import java.util.ArrayList;

public class ArrayTest01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        //添加字符串对象
        array.add("计算机");
        array.add("京津冀");
        array.add("嗷嗷啊");

        //遍历集合每一个元素
        for(int i = 0; i < array.size(); i++){
           // System.out.println(array.get(i));
            String s = array.get(i);
            System.out.println(s);
        }

    }
}
