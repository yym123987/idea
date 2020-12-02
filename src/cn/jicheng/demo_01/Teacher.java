package cn.jicheng.demo_01;

public class Teacher extends Persen{
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void receive(){
        System.out.println("收作业....");
    }
    public void check(){
        System.out.println("批改作业....");
    }
}
