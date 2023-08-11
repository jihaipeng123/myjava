package com.itheima_03;


public class NewPhone extends Phone{
    //方法重写
    @Override
    public void call(String name){
        System.out.println("开启视频通话");
        super.call(name);
    }
}
