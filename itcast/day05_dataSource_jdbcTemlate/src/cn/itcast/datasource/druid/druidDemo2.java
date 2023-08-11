package cn.itcast.datasource.druid;

import cn.itcast.datasource.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*使用Druid连接池的工具类*/
public class druidDemo2 {
    public static void main(String[] args) {
      /* 完成添加*/
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();

            //2定义SQL
            String sql = "insert into dept values(41,?,?)";

            //3获取pstmt对象
             pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"教研部");
            pstmt.setString(2,"北京");

            //4执行sql;
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            JDBCUtils.close(pstmt,conn);
        }
    }
}
