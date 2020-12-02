package cn.Demo;

import java.util.Scanner;

public class Demo_4 {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Boolean b=isPalindrome(s);
        System.out.println(b);
    }

    public static boolean isPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        stringBuffer.reverse();
        int count=0;
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i)==s.charAt(i)){
                count++;
            }
        }
        if (count==s.length()){
            return true;
        }else{
            return false;
        }
    }
}
