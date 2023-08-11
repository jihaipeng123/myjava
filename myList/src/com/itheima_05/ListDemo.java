package com.itheima_05;//232

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student s1 = new Student("林青霞",18);
        Student s2 = new Student("安安",23);
        Student s3 = new Student("兰兰",38);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        //迭代器遍历
        Iterator<Student> it= list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName() +","+ s.getAge());
        }
        System.out.println("--------");

        //普通for
        for(int i = 0; i < list.size(); i++){
            Student s = list.get(i);
            System.out.println(s.getName() +","+ s.getAge());
        }
        System.out.println("--------");

        //增强for
        for(Student s : list){
            System.out.println(s.getName() +","+ s.getAge());
        }
        System.out.println("--------");
        
    }
}

