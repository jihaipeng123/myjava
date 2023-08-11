package com.itheima_03;//240

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("aaaa");
        hs.add("bbbb");
        hs.add("cccc");
        hs.add("aaaa");

        for(String s : hs){
            System.out.println(s);
        }
    }
}
