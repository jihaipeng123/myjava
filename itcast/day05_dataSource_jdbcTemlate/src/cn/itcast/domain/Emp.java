package cn.itcast.domain;

import java.util.Date;

public class Emp {
    private Integer id;
    private String name;
    private String gender;
    private Double salary;
    private Date join_date;
    private Integer dept_id;

    public Emp() {
    }

    public Emp(Integer id, String name, String gender, Double salary, Date join_date, Integer dept_id) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.join_date = join_date;
        this.dept_id = dept_id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Double getSalary() {
        return salary;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", join_date=" + join_date +
                ", dept_id=" + dept_id +
                '}';
    }
}

