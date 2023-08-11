package com.itheima_02;//239

/*
哈希值：
    是Jdk根据对象的地址或者字符串或者数值算出来的int类型的数值
public int hasCode(); 返回对象的哈希值
*/

public class HashDemo {
    public static void main(String[] args) {

        Student s1 = new Student("林青霞",13);
        Student s2 = new Student("啊啊啊", 14);

        //同一个对象多次调用hasCode（）方法返回的哈希值是相同的；
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println("--------");

        System.out.println(s2.hashCode());

        System.out.println("aaaa".hashCode());
        System.out.println("bbbb".hashCode());
        System.out.println("cccc".hashCode());
        System.out.println("--------");

        System.out.println("中的".hashCode());
        System.out.println("哈哈".hashCode());

    }
}
