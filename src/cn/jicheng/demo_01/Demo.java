package cn.jicheng.demo_01;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        Student student=new Student("杨益铭",18);
        Teacher teacher = new Teacher("勒布朗詹姆斯",35);
        System.out.println(student);
        student.write();
        student.finish();
        System.out.println(teacher);
        teacher.receive();
        teacher.check();
    }
}
