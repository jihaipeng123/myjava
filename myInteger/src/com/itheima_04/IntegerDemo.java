package com.itheima_04; //205
/*装箱：把基本数据类型转换为对应的包装类类型
拆箱：把包装类类型转换为对应的基本数据类型*/
public class IntegerDemo {
    public static void main(String[] args) {
        //装箱：把基本数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100);
        Integer i1 = 100; //自动装箱

        //拆箱：把包装类类型转换为对应的基本数据类型
        i1 = i1.intValue() + 200;

        i1 += 200;  //隐含自动拆箱和装箱
        System.out.println(i1);

        Integer iii = null;
        if(iii!=null) iii += 300;
    }
}
