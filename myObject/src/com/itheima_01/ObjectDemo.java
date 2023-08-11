package com.itheima_01; //视频196
//Object 是类层次结构的根，每个类可以将Object作为超类，所有类都直接或者间接的继承自该类
//看方法源码，选中方法，按下ctrl+B;
//建议所有子类重写此方法toString()，自动生成即可
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(20);
        System.out.println(s.getName()+", "+s.getAge());

        System.out.println(s);
        System.out.println(s.toString());
        //输出com.itheima_01.Student@1b6d3586

        /*public void println(Object x) {
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }

        public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }*/

    }
}
