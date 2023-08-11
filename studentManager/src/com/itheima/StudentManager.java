package com.itheima;
/*学生管理系统*/

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    public static void main(String[] args) {
        //创建集合对象，用于存储学生对象数据
        ArrayList<Student> array = new ArrayList<>();

    /*1用输出语句完成主界面的编写；
        2用Scanner实现键盘录入数据；
        3用switch语句完成操作的选择；
        4用循环完成再次回到主界面；*/

    //4用循环完成再次回到主界面；
        while(true) {
            //1用输出语句完成主界面的编写；
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            //2用Scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //3用switch语句完成操作的选择；
            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //break;
                    System.exit(0); //JVM退出
            }

        }

    }

    //定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array){
        //键盘录入学生对象所需要的提示信息
        Scanner sc = new Scanner(System.in);

        //为了让 sid 在 while 循环外面被访问到，将他定义在循环外面
        String sid;
        //为了让程序重新回到这里，使用循环语句
        while(true) {
            System.out.println("请输入学生学号： ");
            sid = sc.nextLine();
            //判断学号是否已经使用过
            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入");
            }else{
                break;
            }
        }
        System.out.println("请输入学生姓名： ");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄： ");
        String age = sc.nextLine();
        System.out.println("请输入学生地址： ");
        String address = sc.nextLine();

        //创建学生对象，把键盘录入数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid) ;
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //将学生对象添加到集合中
        array.add(s);

        //给出添加成功提示
        System.out.println("添加学生成功");
    }

    //定义一个方法，判断学生学号是否被使用
    public static boolean isUsed(ArrayList<Student> array, String sid){
        //学号相同返回true
        boolean flag = false;

        for(int i = 0;i < array.size(); i++) {
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                flag = true;
                break;
            }
        }

        return flag;
    }

    //定义一个方法，用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array){
        //判断集合中是否有数据，如果没有显示提示信息
        if(array.size()==0){
            System.out.println("无信息，请先添加信息再查询");
            //为了让程序不在向下执行，用return;
            return;
        }

        //显示表头信息(\t就是Table键的位置)
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t地址");

        //将集合中数据取出，遍历
        for(int i = 0; i < array.size(); i++){
            Student s = array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"岁\t"+s.getAddress());
        }
    }

    //定义一个方法，用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你删除的学生的学号：");
        String sid = sc.nextLine();

        //遍历集合将学生对象从集合中删除
        //在删除操作前，对学号是否存在进行判断
        int idex = -1;
        for(int i =0; i < array.size(); i++){
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                idex = i;
                break;
            }
        }
        if(idex == -1){
            System.out.println("该信息不存在，重新输入");
        }
        else{
            array.remove(idex);
            //给出删除成功提示
            System.out.println("删除学生成功");
        }
    }

    //定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String sid = sc.nextLine();

        int idex = -1;
        for(int i = 0; i < array.size(); i++){
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                idex = i;
            }
        }
        if(idex==-1){
            System.out.println("该信息不存在，重新输入");
            return;
        }

        //键盘录入要修改的信息
        System.out.println("请输入新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入新年龄：");
        String age = sc.nextLine();
        System.out.println("请输入新地址：");
        String address = sc.nextLine();

        //创建学生对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //遍历集合修改对应的学生信息
        array.set(idex,s);

        //提示
        System.out.println("修改学生成功");
    }

}
