package com.itheima_01;
/*
Calender 为某一时刻和一组日历字段之间的转换提供一些方法，并为操作日历提供了提携方法

Calender 提供了一个类方法 getInstance 用于 Calander 对象，其日历字段以使用当前日期和时间初始化；
    Calendar rightNow = Calendar.getInstance();
*/

import java.util.Calendar;
import java.util.concurrent.CancellationException;

public class CalenderDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+(month+1)+"月"+date+"日");

    }

}
