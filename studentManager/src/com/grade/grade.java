package com.grade;

public class grade {
    //姓名
    private String name;
    //Java
    private int java;
    //python
    private int python;
    //总分
    private int total ;

    public grade() {
    }

    public grade(String name, int java, int python) {
        this.name = name;
        this.java = java;
        this.python = python;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public void setPython(int python) {
        this.python = python;
    }

    public void setTotal(int total) { this.total = total; }

    public String getName() {
        return name;
    }

    public int getJava() {
        return java;
    }

    public int getPython() {
        return python;
    }

    public int getTotal() {
        return total;
    }
}
