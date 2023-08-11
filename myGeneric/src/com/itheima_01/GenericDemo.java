package com.itheima_01;//250
//泛型
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*需求： Collection集合存储字符串并遍历*/
public class GenericDemo {
    public static void main(String[] args) {
        //创建对象
        Collection<String> c =new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");

        Iterator<String > it = c.iterator();
        while(it.hasNext()){
            String obj = it.next();
            //String s =(String)it.next();
            System.out.println(obj);
        }
    }
}
