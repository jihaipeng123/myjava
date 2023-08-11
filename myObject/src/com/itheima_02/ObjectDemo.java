package com.itheima_02;//197
/*
测试类
public boolean equals(Object obj),指示一些其他对象是否等于此
重写equals()方法
*/
public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞",18);
        Student s2 = new Student("林青霞",18);

        //比较俩个对象内容是否相同,s1 ,s2代表的是地址值
        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));
        /*public boolean equals(Object obj) {
            return (this == obj);    //this = s1, obj = s2;
        }*/

    }
}
