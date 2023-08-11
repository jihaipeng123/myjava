package com.itheima_01;

public class StaticDemo {
    public static void main(String[] args) {
        //static修饰建议用类名访问
        Student.university = "船只大学";

        Student s1 = new Student();
        s1.name = "林青霞";
        s1.age = 30;
        //s1.university = "清华";
        s1.show();

        Student s2 = new Student();
        s2.name = "风清扬";
        s2.age = 20;
        s2.show();

    }
}
