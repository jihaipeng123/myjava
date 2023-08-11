package com.itheima_04;
//匿名内部类  本质：是一个继承了该类或者实现了该接口的子类匿名对象
public class Outer {

    public void method(){

        /*new Inner(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };  //注意分号*/

        /* new Inner(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();
*/
         //多次调用

        Inner i =new Inner(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();
        i.show();
    }
}
