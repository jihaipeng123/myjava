package com.itheima_02;//223

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/*迭代器*/
public class IteratorDemo {
    public static void main(String[] args) {
        //创建对象
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("World");
        c.add("java");
        //Interator<E> iterator();,返回集合中元素的迭代器，通过集合的iterator（）方法得到的
        Iterator<String> it = c.iterator();
        /*
        //E next（）；返回迭代器的下一个元素
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        */

        /*//boolean hasNext();如果迭代器具有更多元素，则返回true
        if(it.hasNext()){
            System.out.println(it.next());
        }
        if(it.hasNext()){
            System.out.println(it.next());
        }
        if(it.hasNext()){
            System.out.println(it.next());
        }
        if(it.hasNext()){
            System.out.println(it.next());
        }*/

        while(it.hasNext()){
        //    System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
        }

    }
}
