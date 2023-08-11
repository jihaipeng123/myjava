package cn.itcast.jdbctemplate;

/*JdbcTemplate 入门*/

import cn.itcast.datasource.util.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class jdbcTemplateDemo1 {
    public static void main(String[] args) {
        //1 导入jar包
        //2 创建JdbcTemplate对象；
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql = "update dept set loc = '上海' where id = ?" ;
        int count = template.update(sql, 41);
        System.out.println(count);
    }
}
