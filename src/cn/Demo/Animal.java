package cn.Demo;

import java.io.Serializable;

public class Animal implements Serializable{
    private String type;
    private String sex;
    private Integer age;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "种类=" + type +
                ", 性别=" + sex +
                ", 年龄=" + age +
                '}';
    }

}
