package com.itheima_02;

/*public abstract void add(int field,int amount);//根据日历规则，将指定的时间添加或减去给定的日历字段
public final void set(int year,int month,int date);//设置当前的日历时间*/

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+(month+1)+"月"+date+"日");

        //3年前的5天前
        c.add(Calendar.YEAR,-3);
        c.add(Calendar.DATE,-5);
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH);
        int date1 = c.get(Calendar.DATE);
        System.out.println(year1+"年"+(month1+1)+"月"+date1+"日");

        //设置时间
        c.set(2048,11,11);
        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH);
        int date2= c.get(Calendar.DATE);
        System.out.println(year2+"年"+(month2+1)+"月"+date2+"日");

    }
}
