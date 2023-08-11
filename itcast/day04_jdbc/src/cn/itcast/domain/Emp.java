package cn.itcast.domain;

/*
  封装Emp表数据的JavaBean   练习jdbcDemo7
*/

import java.util.Date;

public class Emp {
    private int id;
    private String  name;
    private String  gender;
    private int salary;
    private Date join_date;
    private int dept_id;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public int getDept_id() {
        return dept_id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + gender + '\'' +
                ", salary=" + salary +
                ", join_date=" + join_date +
                ", dept_id=" + dept_id +
                '}';
    }
}
