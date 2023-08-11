package com.itheima_08;//249

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*获得不重复的随机数(1~~~20)*/
public class Setdemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();//HashSet不排序，TreeSet排序

        Random r = new Random();

        while(set.size()<10){
            int i = r.nextInt(20) + 1;
            set.add(i);
        }

        for(Integer i : set){
            System.out.println(i);
        }
    }
}
