package cn.itcast.jdbc;

import cn.itcast.domain.Emp;
import cn.itcast.util.jdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/** 定义一个方法，查询emp表的数据将其封装为对象，然后装载集合，返回。
        1. 定义Emp类
        2. 定义方法 public List<Emp> findAll(){}
        3. 实现方法 select * from emp;*/

public class jdbcDemo7 {

    public static void main(String[] args) {
        List<Emp> list = new jdbcDemo7().findAll2();
        System.out.println(list);
    }
//方法一
    public List<Emp> findAll(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = null;
        try {
            //1注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2获取连接
            conn = DriverManager.getConnection("jdbc:mysql:///db1", "root", "root");
            //3定义sql
            String sql = "select * from emp";
            //4获取执行SQL的对象；
             stmt = conn.createStatement();
            //5执行sql
            rs = stmt.executeQuery(sql);
            //6遍历结果集，封装对象，装载集合
            Emp emp = null;
            list = new ArrayList<Emp>();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int salary = rs.getInt("salary");
                Date join_date = rs.getDate("join_date");
                int dept_id = rs.getInt("dept_id");
                //创建Emp对象并赋值
                emp = new Emp();
                emp.setId(id);
                emp.setName(name);
                emp.setSalary(salary);
                emp.setGender(gender);
                emp.setDept_id(dept_id);
                emp.setJoin_date(join_date);
                //装载集合
                list.add(emp);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //stmt.close();
            //7. 释放资源
            //避免空指针异常

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
//方法二  演示jdbc的工具类
    public List<Emp> findAll2(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = null;
        try {
            conn = jdbcUtils.getConnection();
            //3定义sql
            String sql = "select * from emp";
            //4获取执行SQL的对象；
            stmt = conn.createStatement();
            //5执行sql
            rs = stmt.executeQuery(sql);
            //6遍历结果集，封装对象，装载集合
            Emp emp = null;
            list = new ArrayList<Emp>();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int salary = rs.getInt("salary");
                Date join_date = rs.getDate("join_date");
                int dept_id = rs.getInt("dept_id");
                //创建Emp对象并赋值
                emp = new Emp();
                emp.setId(id);
                emp.setName(name);
                emp.setSalary(salary);
                emp.setGender(gender);
                emp.setDept_id(dept_id);
                emp.setJoin_date(join_date);
                //装载集合
                list.add(emp);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //7. 释放资源
            jdbcUtils.close(rs,stmt,conn);
        }
        return list;
    }
}
