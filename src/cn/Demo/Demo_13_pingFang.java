package cn.Demo;

import java.util.Scanner;

public class Demo_13_pingFang {
    public static void main(String[] args) {
        System.out.println("请输入一个整数N（N<100000）");
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int count=0;
        for (int i = 1; i <=N; i++) {
            for (int j = 1; j <=N; j++) {
                if (i<j){
                    break;
                }else if (j*j==i){
                    count++;
                }
            }
        }
        System.out.println("平方数的个数为："+count);
    }
}
