package com.itheima_02;//202
/*// 构造法方法：
        public Integer(int value),根据int值创建 Integer 对象（过时）
        public Integer(String s),根据Stringt值创建 Integer 对象（过时）
    静态方法获取对象;
        public static Integer valueof(int i),返回表示指定的int 值的Integer实例；
        public static Integer valueof(String s),返回一个保存指定值的Inreger 对象 String；*/
public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        System.out.println(i1);
        Integer i2 = new Integer("50");
        System.out.println(i2);
        System.out.println("--------");
        /*Integer i3 = new Integer("abc"); //必须是由数字组成的字符串
        System.out.println(i3);*/

        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);
        Integer i4 = Integer.valueOf("50");
        System.out.println(i4);
    }
}
