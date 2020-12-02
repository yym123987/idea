package cn.Demo;

import java.util.Scanner;

public class Demo_14_feiOuQieHe {
    public static void main(String[] args) {
        System.out.println("请输入一个区间的左区间N和右区间M：");
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int count=0;
        for (int i = N; i < M; i++) {
            for (int j = 2; j < 11; j++) {
                if (i%2==0){
                    break;
                }else if (i%j==0&&i!=j){
                    count++;
                    break;
                }
            }
        }
        System.out.println("非偶数的合数个数为："+count);
    }
}
