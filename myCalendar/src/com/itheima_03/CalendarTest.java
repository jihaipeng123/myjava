package com.itheima_03; //212

/*二月天*/

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();

        //设置日期
        Calendar c =Calendar.getInstance();
        c.set(year,2,1);
        //往前推1天
        c.add(Calendar.DATE,-1);
        int date = c.get(Calendar.DATE);

        System.out.println(year+"年的2月有"+date+"天。");

    }
}
