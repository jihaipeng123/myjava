package com.itheima_03;
/*测试类泛型接口*/

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1 = new Genericlmpl<String>();
        g1.show("aaaa");

        Generic<Integer> g2 = new Genericlmpl<Integer>();
        g2.show(12);
    }
}
