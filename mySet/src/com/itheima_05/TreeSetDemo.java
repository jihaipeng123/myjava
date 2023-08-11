package com.itheima_05;//245

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();

        t.add(13);
        t.add(20);
        t.add(23);
        t.add(12);

        for (Integer i : t) {
            System.out.println(i);
        }

        
    }
}
