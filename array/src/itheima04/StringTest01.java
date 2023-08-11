package itheima04;

import java.util.Scanner;
public class StringTest01 {
    public static void main(String[] args) {
        //已知用户名和密码，定义俩个字符串
        String username = "itheima";
        String password = "czkb";

        //循坏实现多次机会
        for(int i = 0; i < 3; i++){

            //键盘录入要登录的用户名和密码，用Scanner实现
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();

            //用户名和密码进行比较，给出提示；equals进行比较
            if(name.equals(username) && pwd.equals(password)){
                System.out.println("登录成功");
                break;
            }else{
                if(2-i==0){
                    System.out.println("账户锁定");
                }else {
                    System.out.println("登录失败，你还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}
