package cn.Demo;

import java.util.Scanner;

public class Demo_17_Main {
    public static void main(String[] args) {
        System.out.println("请分别输入一个整数N（N<10000）和整数A（A<N）:");
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int A=scanner.nextInt();
        int count=0;
        for (int i = 1; i <= N; i++) {
            if (i%A==A-1 && i%2==0){
                count++;
            }
        }
        System.out.println("1到N的整数中，被A除余A-1的偶数的个数为："+count);
    }
}
