package com.itheima_03;//230

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*列表迭代器*/

public class ListlteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("javase");

        //通过List集合的ListIterator（）方法得到
        /*ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("------------");

        while(lit.hasPrevious()){
            String s = lit.previous();
            System.out.println(s);
        }
        System.out.println("------------");*/

        //获取列表迭代器
        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            if(s.equals("world")){
                lit.add("java");
            }
        }
        System.out.println(list);
    }
}
