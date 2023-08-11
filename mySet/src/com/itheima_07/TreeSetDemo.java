package com.itheima_07;//248

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //创建TreeSet对象。比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override   //s1出现在前面是从低到高；
            public int compare(Student s1, Student s2) {
                //主要条件
                int num = s2.getSum()- s1.getSum();
                //次要条件
                int num2 = num==0? s1.getChinese()-s2.getChinese():num;
                int num3 = num2==0? s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });

        //创建学生对象
        Student s1 = new Student("aaa",24,34);
        Student s2 = new Student("ccc",23,56);
        Student s3 = new Student("bbb",56,89);
        Student s4 = new Student("ddd",55,89);
        Student s5 = new Student("eee",54,90);
        Student s6 = new Student("fff",54,90);


        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for(Student s: ts){
            System.out.println(s.getName()+","+s.getMath()+","+s.getChinese()+","+s.getSum());
        }
    }
}
