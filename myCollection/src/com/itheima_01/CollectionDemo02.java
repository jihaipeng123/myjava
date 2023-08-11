package com.itheima_01;//222

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {
    public static void main(String[] args) {
        //创建集合
        Collection<String> c = new ArrayList<>();

        //boolean add(E e),添加元素,永远返回true,可重复
        System.out.println(c.add("hello"));
        c.add("World");
        System.out.println(c.add("World"));
        System.out.println("--------------");

        //boolean remove(E e)从集合中删除指定元素
        System.out.println(c.remove("java"));
        System.out.println(c.remove("World"));
         System.out.println("--------------");

        //boolean contains(Object o);判断集合中是否存在指定元素
        System.out.println(c.contains("java"));
        System.out.println(c.contains("hello"));
          System.out.println("--------------");

        //清空集合对象void clear();
        // c.clear();

        //判断集合是否为空 boolean isEmpty();
        System.out.println(c.isEmpty());

        //int size();返回集合中元素的个数
        System.out.println(c.size());

        //输出集合元素
        System.out.println(c);

    }
}
