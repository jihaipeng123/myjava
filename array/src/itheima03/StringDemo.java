package itheima03;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1:" + s1);

        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        byte[] bys = {97,98,99};
        String s3  = new String(bys);
        System.out.println("s3:" + s3) ;

        String s4 = "abc";
        System.out.println("s4:" + s4);

        //比较字符串地址是否相等
        String s5 = new String(chs);
        System.out.println(s2==s5);
        String s6 = "abc";
        System.out.println(s6==s4);

        //比较字符串内容是否相等
        System.out.println(s2.equals(s5));
        System.out.println(s6.equals(s4));
    }
}

