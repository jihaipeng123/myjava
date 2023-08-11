package com.itheima_02;//260
/*Map的遍历1*/
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo_01 {
    public static void main(String[] args) {
        //创建集合
        Map<String,String> map = new HashMap<String, String>();
        //添加元素,键唯一
        map.put("itheima001","林青霞");
        map.put("itheima002","啊啊啊");
        map.put("itheima003","aaaaa");

        Set<String> keyset = map.keySet();
        for(String key: keyset){
            String value = map.get(key);
            System.out.println(key+","+value);
        }

    }
}
