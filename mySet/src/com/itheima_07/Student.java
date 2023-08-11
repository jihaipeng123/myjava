package com.itheima_07;

public class Student {
    private String name;
    private int Chinese;
    private  int Math;

    public Student() {
    }

    public Student(String name, int chinese, int math) {
        this.name = name;
        Chinese = chinese;
        Math = math;
    }

    public String getName() {
        return name;
    }

    public int getChinese() {
        return Chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public void setMath(int math) {
        Math = math;
    }
    public int getSum(){
        return this.Chinese+this.Math;
    }
}
