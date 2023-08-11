package com.itheima_02;
/*需求：
    创建一个存储学生对象的集合，存储3个学生，使用程序实现在控制台遍历该集合
思路：   1定义学生类
        2创建集合对象
        3创建学生对象
        4添加学生对象到集合中
        5遍历集合，通用遍历*/

import java.util.ArrayList;

public class ArrayListTest02 {
    public static void main(String[] args) {
        //2创建集合对象
        ArrayList<Student> array = new ArrayList();

        //3创建学生对象
        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("风清扬",33);
        Student s3 = new Student("张曼玉",18);

        //4添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //5遍历集合，通用遍历
        for(int i = 0; i < array.size(); i++){
            Student s = array.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}
