package com.itheima_04;//231

/*增强for循环,  内部原理是Iterator迭代器*/

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("-------");

        String[] strarray = {"hello", "world", "java"};
        for(String s : strarray){
            System.out.println(s);
        }
        System.out.println("-------");

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("woyld");
        list.add("javase");
        for(String s : list){
            System.out.println(s);
        }
    }
}
