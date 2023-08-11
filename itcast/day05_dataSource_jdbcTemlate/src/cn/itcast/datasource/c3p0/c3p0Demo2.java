package cn.itcast.datasource.c3p0;

/*c3p0演示*/

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class c3p0Demo2 {
    public static void main(String[] args) throws SQLException {
        //1 获取DataSource，使用默认配置
        //DataSource ds = new ComboPooledDataSource();
        //1.1 使用指定名称配置
        DataSource ds = new ComboPooledDataSource("otherc3p0");

        //2 获取连接,最大连接数
        for(int i = 1 ; i<= 5; i++){
            Connection conn = ds.getConnection();
            System.out.println(i+":"+conn);

           /* if(i==5){
                conn.close();//归还链接到连接池中
            }*/
        }
    }
}
