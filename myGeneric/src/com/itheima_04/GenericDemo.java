package com.itheima_04;//254

import java.util.ArrayList;
import java.util.List;

/*类型通配符*/
public class GenericDemo {
    public static void main(String[] args) {
        //类型通配符<?>
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();


        //类型通配符上限<? extends Number>
        List<? extends Number> list4 = new ArrayList<Integer>();//Number及其子类

        //类型通配符下限<? super Number>
        List<? super Number> list5 = new ArrayList<Object>();//Number及其父类
    }
}
