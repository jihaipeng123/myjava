package com.itheima_04;//244

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> linkedHasdSet = new LinkedHashSet<String>();

        linkedHasdSet.add("String");
        linkedHasdSet.add("Aiopthb");
        linkedHasdSet.add("zzzzzz");

        //遍历集合
        for(String s : linkedHasdSet){
            System.out.println(s);
        }

    }
}
