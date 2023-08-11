package com.itheima_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Student> hm = new HashMap<String,Student>();

        Student s1 = new Student("啊啊啊",30);
        Student s2 = new Student("gdbtg",30);
        Student s3 = new Student("tbnbb",30);

        hm.put("itheima01",s1);
        hm.put("itheima02",s2);
        hm.put("itheima03",s3);

        //键找值
        Set<String> keyset = hm.keySet();
        for(String key: keyset){
            Student value = hm.get(key);
            System.out.println(key+","+value.getName()+","+value.getAge());
        }

        System.out.println("---------");
        //键值对对象找键和值
        Set<Map.Entry<String, Student>> entryset = hm.entrySet();
        for(Map.Entry<String, Student> me: entryset){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+","+value.getName()+","+value.getAge());
        }


    }
}
