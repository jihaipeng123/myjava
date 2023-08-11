package com.itheima_06;//247

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num ==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        Student s1 = new Student("aaaa",12);
        Student s2 = new Student("bbbbb", 12);
        Student s3 = new Student("sssss", 15);
        Student s4 = new Student("cccc", 19);


        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for(Student s: ts){
            System.out.println(s.getName()+","+s.getAge());
        }

    }
}
