package com.itheima_04;
/*测试类*/
public class PersonDemo {
    public static void main(String[] args) {
        //创建对象
        PingpangPlayer pp = new PingpangPlayer();//无参构造
        pp.setName("王浩");
        pp.setAge(20);
        System.out.println(pp.getName()+", "+ pp.getAge());
        pp.eat();
        pp.learn();
        pp.speak();
        System.out.println("-------------------");

        BasketballCoach bb = new BasketballCoach("阿牛",40);
        System.out.println(bb.getName()+", "+ bb.getAge());
        bb.eat();
        bb.teach();

    }

}
