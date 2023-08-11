package com.itheima_01;//214
/*
异常
*/
public class ExceptionDemo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        System.out.println("开始");

        int arr[] = {1,2,3};
        //System.out.println(arr[3]);//ArrayIndexOutOfBoundsException 数据索引越界异常
        System.out.println(arr[2]);

        System.out.println("结束");
    }
}
