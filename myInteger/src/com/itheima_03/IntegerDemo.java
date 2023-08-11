package com.itheima_03;//203
/*int 和 String 的相互转换*/
public class IntegerDemo {
    public static void main(String[] args) {
        //int 转 String
        int number = 100;
        //方式一
        String s1 = "" + number;
        System.out.println(s1);
        //方式二
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("-----");

        //String 转 int
        String s = "100";
        //方式一 String ---Integer ----int
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);
        //方式二
        int y = Integer.parseInt(s);
    }
}
