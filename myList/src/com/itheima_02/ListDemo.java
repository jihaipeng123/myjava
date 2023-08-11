package com.itheima_02;//229

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//并发修改异常

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        Iterator<String> it = list.iterator();
        /*while(it.hasNext()){
            String s = it.next();
            if(s.equals("world")){
                list.add("javase");
            }
        }
*/
        for(int i = 0; i< list.size();i++){
            String s = list.get(i);
            if(s.equals("world")){
                list.add("javase");
            }
        }

        System.out.println(list);
    }
}
