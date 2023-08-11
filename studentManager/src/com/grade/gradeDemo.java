package com.grade;

import java.util.ArrayList;
import java.util.Scanner;

public class gradeDemo {

    public static void main(String[] args) {

        ArrayList<grade> array = new ArrayList<>();

        String s1 = "admin";
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("----------------");
            System.out.println("请先登录密码：");
            System.out.println("----------------");

            String s2 = sc.nextLine();
            if(s2.equals(s1)){
                break;
            }
            else{
                System.out.println("密码错误，请重试");
            }
        }



        while(true) {
            System.out.println("----------------");
            System.out.println("1. 查看成绩");
            System.out.println("2. 添加信息");
            System.out.println("3. 删除信息");
            System.out.println("0. 退出程序");
            System.out.println("----------------");


            String line = sc.nextLine();

            switch (line) {
                case "1":
                    findAllStudent(array);

                    break;
                case "2":
                     addStudent(array);
                    break;
                case "3":
                     deleteStudent(array);
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("您的输入有误");
            }

        }

    }

    public static void findAllStudent(ArrayList<grade> array){
        //判断集合中是否有数据，如果没有显示提示信息
        if(array.size()==0){
            System.out.println("无信息，请先添加信息再查询");
            return;
        }

        System.out.println("共有"+array.size()+"名同学");
        System.out.println("姓名\tJava\tPython\t\t总分");

        for(int i = 0; i < array.size(); i++){
            grade s = array.get(i);
            System.out.println(s.getName()+"\t"+s.getJava()+"\t\t"+s.getPython()+"\t\t"+s.getTotal());
        }
    }

    public static void addStudent(ArrayList<grade> array){

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入姓名： ");
        String name = sc.nextLine();

        System.out.println("请输入Java成绩： ");
        int java;
        if(sc.hasNextInt()){
            java = sc.nextInt();
        }
        else{
            System.out.println("输入有误");
            return;
        }

        System.out.println("请输入Python成绩： ");
        int python;
        if(sc.hasNextInt()){
            python = sc.nextInt();

        }
        else{
            System.out.println("输入有误");
            return;
        }

        int total = java + python;


        grade s = new grade();
        s.setName(name); ;
        s.setJava(java);
        s.setPython(python);
        s.setTotal(total);

        array.add(s);

        System.out.println("添加成功");
    }


    public static void deleteStudent(ArrayList<grade> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();

        int idex = -1;
        for(int i =0; i < array.size(); i++){
            grade s = array.get(i);
            if(s.getName().equals(name)){
                idex = i;
                break;
            }
        }
        if(idex == -1){
            System.out.println("未找到名为"+name+"的信息");
        }
        else{
            array.remove(idex);
            System.out.println("删除成功！");
        }
    }

}
