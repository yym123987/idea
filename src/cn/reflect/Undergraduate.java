package cn.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Undergraduate {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("cn.reflect.Person");
        Object obj = clazz.getConstructor(String.class,int.class).newInstance("詹姆斯",20);
        Class<?> clazz1 = Class.forName("cn.reflect.Student");
        Object obj1 = clazz1.getConstructor().newInstance();
        //获取方法对象
        Method method = clazz1.getMethod("show",String.class);
        //调用此方法
        method.invoke(obj1,"大学生");
    }
}
