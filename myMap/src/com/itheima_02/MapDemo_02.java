package com.itheima_02;//261

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Map遍历2*/
public class MapDemo_02 {
    public static void main(String[] args) {
        //创建集合
        Map<String,String> map = new HashMap<String, String>();
        //添加元素,键唯一
        map.put("itheima001","林青霞");
        map.put("itheima002","啊啊啊");
        map.put("itheima003","aaaaa");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for(Map.Entry<String, String> me: entrySet){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }

    }
}
