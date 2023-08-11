package com.itheima_07;//237

import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();

        linkedlist.add("aaaa");
        linkedlist.add("wwwww");
        linkedlist.add("sssss");
        linkedlist.add("ddddd");

        //添加
        linkedlist.addFirst("zzzz");
        linkedlist.addLast("xxxxx");

        //返回元素
        System.out.println(linkedlist.getFirst());
        System.out.println(linkedlist.getLast());

        //删除元素并返回
        System.out.println(linkedlist.removeFirst());
        System.out.println(linkedlist.removeLast());

        System.out.println(linkedlist);

    }
}
