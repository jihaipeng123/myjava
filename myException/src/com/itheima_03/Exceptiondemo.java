package com.itheima_03;//217

/*运行异常，编译异常*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exceptiondemo {
    public static void main(String[] args) {
        method();
        method2();
    }

    //运行时异常，非受检异常,能通过编译
    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    //编译时异常,必须显示处理
    public static void method2(){
        try {
            String s = "2023-08-09";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch(ParseException e){
            e.printStackTrace();
        }
    }

}
