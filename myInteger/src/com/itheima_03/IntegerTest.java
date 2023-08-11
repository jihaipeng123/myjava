package com.itheima_03;//204
/*需求：
    有一个字符串：“91 27 46 38 50“，请写程序实现最终输出”27 38 46 50 91“；
思路：
    1定义一个字符串
    2把字符串中的数字数据存储到一个String类型的数组中
        得到字符串中每一个数组数据？
            public String[] split(String regex)
        定义一个int数组，把String[]数组中的每一个元素存储到int数组中
            public Static int parseInt(String s)
    3对int数组进行排序
    4把排好的元素拼接得到字符串，StringBuilder实现
    5输出结果*/

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        //1定义一个字符串
        String s = "91 27 46 38 50";

        //2把字符串中的数字数据存储到一个int类型的数组中
        String[] strArr = s.split(" ");
        int[] arr = new int[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            arr[i] = Integer.parseInt(strArr[i]);
            System.out.println(arr[i]);
        }

        //3对int数组进行排序
        Arrays.sort(arr);

        //4把排好的元素拼接得到字符串，StringBuilder实现
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();

        System.out.println("result: "+result);

    }

}
