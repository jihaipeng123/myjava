package itheima02;
/*学生测试类*/
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        //使用对象
        s.name = "冀海鹏";
        s.setAge(18) ;
        s.study();
        s.doHome();
        s.show();
    }
}
