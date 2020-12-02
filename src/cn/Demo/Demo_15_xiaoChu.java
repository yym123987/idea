package cn.Demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo_15_xiaoChu {
    public static void main(String[] args) {
        System.out.println("请输入一个小写字母字符串(结束即按大写A)：");
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> stringLinkedList = new LinkedList<>();
        //赋值
        for (int i = 0; i < 1000; i++) {
            String next = scanner.next();
            if (next.equals("A")){
                break;
            }
            stringLinkedList.add(next);
        }
        //消除操作
        for (int j = stringLinkedList.size()-1; j >=1 ; j--) {
            if (stringLinkedList.get(j).equals(stringLinkedList.get(j-1))){
                stringLinkedList.remove(j);
                stringLinkedList.remove(j-1);
            }
        }
        if (stringLinkedList.size()==0){
            System.out.println("YES");
        }else {
            for (String list:stringLinkedList){
                System.out.println(list);
            }
        }
    }
}
