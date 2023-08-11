package com.itheima_02;

/*public class Generic {
    public void show(String s){
        System.out.println(s);
    }

    public void show(Integer s){
        System.out.println(s);
    }

    public void show(Boolean s){
        System.out.println(s);
    }
}
*/
/*
//泛型类改进
public class Generic<T>{
    public void show(T t){
        System.out.println(t);
    }
}*/

//泛型方法改进
public class Generic {
    public<T> void show(T t) {
        System.out.println(t);
    }
}