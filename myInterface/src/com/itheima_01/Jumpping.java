package com.itheima_01;
/*
    定义一个接口
    接口无构造方法
    接口是抽象类型
*/
public interface Jumpping {
    //等价
    public int num = 10;
    public final int num2 = 20;
    public static final int num3 = 30;

    public abstract void jump();

    void show();//，默认格式抽象
}
