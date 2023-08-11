package com.itheima_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(); //无参构造
        String s = sdf.format(d);
        System.out.println(s);

        SimpleDateFormat ss = new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss");
        String sss = ss.format(d);
        System.out.println(sss);
    }
}
