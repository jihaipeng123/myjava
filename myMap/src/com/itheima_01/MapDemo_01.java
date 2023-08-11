package com.itheima_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo_01 {
    public static void main(String[] args) {
        //创建集合
        Map<String,String> map = new HashMap<String, String>();
        //添加元素,键唯一
        map.put("itheima001","林青霞");
        map.put("itheima002","啊啊啊");
        map.put("itheima003","aaaaa");
        map.put("itheima003","kkkkk");
        map.put("itheima004","kkkkk");


        System.out.println(map);
    }
}
