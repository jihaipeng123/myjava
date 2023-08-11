package com.itheima_03;//218

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo_01 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        try {
            method2();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }

    //运行时异常，非受检异常,能通过编译
    public static void method() throws ArrayIndexOutOfBoundsException{
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }

    //编译时异常,必须显示处理
    public static void method2() throws ParseException {
         String s = "2023-08-09";
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         Date d = sdf.parse(s);
         System.out.println(d);
    }
}
