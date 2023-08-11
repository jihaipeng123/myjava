package com.itheima_01;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<>();

        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //public boolean remove(Object o) 删除指定元素，返回删除是否成功
        /*System.out.println(array.remove("world"));
        System.out.println(array.remove("javase"));*/

        //public E remove(int index) 删除指定索引处的元素；返回被删除的元素
        /*System.out.println(array.remove(1));*/

        //public E set(int index,E element) 删除指定索引处的元素；返回被删除的元素
        System.out.println(array.set(1,"javase"));

        //public E get(int index) 返回指定索引处的元素
        System.out.println(array.get(1));

        //public int size(); 返回集合的个数
        System.out.println(array.size());

        //输出集合
        System.out.println("array: "+ array);

    }
}
