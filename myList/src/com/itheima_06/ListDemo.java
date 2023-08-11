package com.itheima_06;//235

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");
        for(String s : array){
            System.out.println(s);
        }
        System.out.println("------");

        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("qqqq");
        linkedlist.add("wwww");
        linkedlist.add("eeee");
        for(String s : linkedlist){
            System.out.println(s);
        }
        System.out.println("------");


    }
}
