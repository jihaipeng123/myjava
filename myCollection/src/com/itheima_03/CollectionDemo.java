package com.itheima_03;//225
/*
1.定义学生类
2.创建Collection集合对象
3.创建学生对象
4.把学生添加到集合
5.遍历集合（迭代器）
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {

        //2.创建Collection集合对象
        Collection<Student>  c = new ArrayList<Student>();

        //3.创建学生对象
        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("清飞扬",20);
        Student s3 = new Student("嗷嗷嗷",10);

        //4.把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);

        //5.遍历集合（迭代器）
        Iterator<Student> it = c.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName() +","+s.getAge());
        }
    }
}
