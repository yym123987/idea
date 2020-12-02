package cn.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo_jdbc_02 {
    public static void main(String[] args) {
        //1、导入驱动jar包
        Connection coon=null;
        Statement stmt=null;
        try {
            //2、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //3、获取数据库连接对象
            coon = DriverManager.getConnection("jdbc:mysql:///student?characterEncoding=utf8&useSSL=true", "root", "root");
            //4、定义sql语句
            String sql="insert into stu values(null,'乔治',27,'洛杉矶快船队',2)";
            //5、获取执行sql语句的对象 Statement
            stmt = coon.createStatement();
            //6、执行sql
            int count = stmt.executeUpdate(sql);
            //7、处理结果
            System.out.println(count);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(coon!=null) {
                try {
                    coon.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
