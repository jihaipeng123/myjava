package com.itheima_01;//259

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo_03 {
    public static void main(String[] args) {
        //创建集合
        Map<String,String> map = new HashMap<String, String>();
        //添加元素,键唯一
        map.put("itheima001","林青霞");
        map.put("itheima002","啊啊啊");
        map.put("itheima003","aaaaa");

        //根据建获取值
        System.out.println(map.get("itheima001"));
        System.out.println(map.get("itheima004"));

        //获取所有键的集合
        Set<String> keysey = map.keySet();
        for(String s : keysey){
            System.out.println(s);
        }

        //获取所有值的集合
        Collection<String> values= map.values();
        for(String s : values){
            System.out.println(s);
        }

    }
}
