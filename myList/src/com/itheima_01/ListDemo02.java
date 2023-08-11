package com.itheima_01;//227

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //指定位置添加元素
        list.add(1, "javaee");
        list.add(4, "javaee");

        //删除指定元素,返回被删除的元素
        System.out.println(list.remove(2));

        //修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(1, "wwww"));

        //获取指定位置的元素
        System.out.println(list.get(2));
        System.out.println(list);

        //for循环遍历
        for(int i = 0; i < list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }

    }
}
