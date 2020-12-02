package cn.jicheng.demo_02;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",50000);
        Member member1 = new Member("aaa",0);
        Member member2 = new Member("bbb",5);
        Member member3 = new Member("ccc",74);
        Member member4 = new Member("xx",700);
        Member member5 = new Member("ddd",40);
        Member member6 = new Member("eee",4);
        Member member7 = new Member("fff",0);
        Member member8 = new Member("ggg",66);
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
        member5.show();
        member6.show();
        member7.show();
        member8.show();
        System.out.println("=======================");
        ArrayList<Integer> list = manager.send(20000, 8);
        member1.receive(list);
        member2.receive(list);
        member3.receive(list);
        member4.receive(list);
        member5.receive(list);
        member6.receive(list);
        member7.receive(list);
        member8.receive(list);
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
        member5.show();
        member6.show();
        member7.show();
        member8.show();
    }
}
