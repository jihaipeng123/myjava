package com.itheima_01;//206

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1); //显示当前日期

        long date = 1000*60*60;
        Date d2 = new Date(date);
        System.out.println(d2);
    }

}
