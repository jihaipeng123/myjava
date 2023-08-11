package com.itheima_03;
/*测试类*/
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("林琴华夏");

        System.out.println("-----------");

        NewPhone np = new NewPhone();
        np.call("林琴华夏");
    }
}
