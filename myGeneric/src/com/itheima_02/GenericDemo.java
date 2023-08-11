package com.itheima_02;//252

public class GenericDemo {
    public static void main(String[] args) {
        Generic g = new Generic();

        g.show("aaaa");
        g.show(30);
        g.show(true);

        //Generic<String> g2 = new Generic<String>();
        g.show("aaa");
        //Generic<Integer> g3 = new Generic<Integer>();
        g.show(10);

    }
}
