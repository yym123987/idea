package cn.JDBC;

import java.sql.*;

public class Demo_jdbc_03 {
    public static void main(String[] args) {
        Connection coon =null;
        Statement stmt =null;
        ResultSet rs =null;
        try {
            //1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取数据库连接对象
            coon = DriverManager.getConnection("jdbc:mysql:///student?characterEncoding=utf8&useSSL=true", "root", "root");
            //3、定义sql语句
            String sql="select* from stu";
            //4、获取执行sql语句的对象
            stmt = coon.createStatement();
            //5、执行sql
            rs = stmt.executeQuery(sql);
            //6、处理结果
            //6、1 让游标向下移动一行
            while(rs.next()){
                //循环判断下行是否有数据
                //6、2 获取数据
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String school = rs.getString("school");
                int stu_sch = rs.getInt("stu_sch");
                System.out.println(id+"--"+name+"--"+age+"--"+school+"--"+stu_sch);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs!=null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
