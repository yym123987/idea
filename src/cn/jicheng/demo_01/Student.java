package cn.jicheng.demo_01;

public class Student extends Persen{
    public Student(String name, int age) {
        super(name, age);
    }

    public void write(){
        System.out.println("写作业....");
    }
    public void finish(){
        System.out.println("完成作业.....");
    }
}
