package cn.itcast.datasource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/*druid演示*/
public class druidDemo {
    public static void main(String[] args) throws Exception {
        //1导入jar包
        //2导入配置文件
        //加载配置文件
        Properties pro = new Properties();
        InputStream is = druidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        //4.获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        //5.获取连接
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
