package cn.Demo;


import java.util.Scanner;

public class Demo_16_longestString {
    public static void main(String[] args) {
        System.out.println("请输入待处理小写字母字符串(长度<=200)：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            chars[i]=c;
        }
        int count=0;
        int max=0;
        int temp1=0;
        int temp2=0;
        boolean tag=false;
        for (int j = 0; j < chars.length; j++) {
            for (int k = j+1; k < chars.length; k++) {
                count++;
                if (chars[j]==chars[k]){
                    temp1=j;
                    tag=true;
                    break;
                }
            }
            if (max<count && tag){
                temp2=temp1;
                max=count;
                count=0;
            }else {
            count=0;
            }
        }
        for (int i = temp2; i <= temp2+max; i++) {
            System.out.print(chars[i]+" ");
        }
    }
}
