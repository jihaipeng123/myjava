package com.ithaima_04;
/*测试类*/
public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象并测试
        Animal a = new Cat();
        a.setAge(5);
        a.setName("波比");
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();

        a = new Cat("加菲猫",4);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();
    }
}
