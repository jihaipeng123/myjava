package itheima02;
/*学生类*/
public class Student {
    //成员变量
    String name;

    private int age;
    //提供get/set方法 获取值/设置值
    public void setAge(int a){
        if(a<0 || a>120){
            System.out.println("你给的年龄有误");
        }else{
            age = a;
        }
    }
    public int getAge()
    {
        return age;
    }

    //成员方法
    public void study(){
        System.out.println("好好学习天天向上");
    }
    public void doHome(){
        System.out.println("键盘敲烂，月薪过万");
    }
    public void show(){
        System.out.println(name + "," + age);
    }

}
