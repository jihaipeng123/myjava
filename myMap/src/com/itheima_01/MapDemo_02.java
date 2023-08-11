package com.itheima_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo_02 {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<String, String>();

        map.put("ithaima01","111");
        map.put("ithaima02","222");
        map.put("ithaima03","333");

        //判断集合中是否有该键
        System.out.println(map.containsKey("ithaima02"));
        System.out.println(map.containsKey("ithaima04"));

        //判断集合中是否有该值
        System.out.println(map.containsValue("222"));
        System.out.println(map.containsValue("444"));

        //remove();返回删除键值对应的元素
        System.out.println(map.remove("ithaima01"));
        System.out.println(map);

        //清空集合，集合长度为0
        map.clear();
        System.out.println(map.size());

        //判官集合空
        System.out.println(map.isEmpty());
;    }
}
