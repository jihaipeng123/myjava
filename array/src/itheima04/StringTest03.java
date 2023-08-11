package itheima04;
import java.util.Scanner;
public class StringTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        //定义3个统计变量，初始为0
        int bigCount = 0;
        int smallCount = 0;
        int number = 0;

        for(int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);
            if(ch>='A' && ch<='Z') bigCount++;
            if(ch>='a' && ch<='z') smallCount++;
            if(ch>='0' && ch<='9') number++;
        }
        //输出3种类型的字符个数
        System.out.println("大写字母："+ bigCount + "个");
        System.out.println("小写字母："+ smallCount + "个");
        System.out.println("数字字母："+ number + "个");
    }
}
