package com.itheima_01;
//ArrayList 的构造

import java.util.ArrayList;

public class ArrayListDome01 {
    public static void main(String[] args) {
        //创建一个空的集合对象
        //ArrayList<String> array = new ArrayList<>();
        ArrayList<String> array = new ArrayList<String>();

        //添加 public boolean add(E e);将指定元素追加到此集合的末尾
        System.out.println(array.add("hello"));
        array.add("world");
        array.add("java");

        //添加 public void add(int index,E element)； 在指定位置插入指定元素
        //array.add(1,"javase");
        array.add(3,"javase");
        //输出集合
        System.out.println("array: " + array);
    }
}
